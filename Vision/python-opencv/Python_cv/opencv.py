import numpy as np
import cv2 
import math

# inits open cv and nettableG) 
cap = cv2.VideoCapture(1)
cap.set(cv2.CAP_PROP_BRIGHTNESS, 0.2)
cap.set(cv2.CAP_PROP_CONTRAST, 0)
centers=[] 
fourcc = cv2.VideoWriter_fourcc(*'MJPG')
out = cv2.VideoWriter('appsrc  ! h264parse ! '
                      'rtph264pay config-interval=1 pt=96 ! '
                      'gdppay ! tcpserversink host=localhost port=5000 ',
                      fourcc, 20.0, (640, 480))
        
while(1):

    # Take each frame
    cap.set(3,12)
    _, frame = cap.read()
    
     

    # Convert BGR to HSV
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY )
    hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
    
    blur = cv2.GaussianBlur(gray,(5,5),0)
    ret, thresh_img = cv2.threshold(blur,90,100,cv2.THRESH_BINARY)

    contours =  cv2.findContours(thresh_img,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE)[-2]
    for crt in contours:
        cv2.contourArea(crt)
        cv2.drawContours(frame, [crt], -1, (0,0,255), 3) 
        distance =36 * 480 / (crt * math.tan( -34.3)) 
   # cx = int(mid['m10']/perimeter)
   # cy = int(mid['m01']/perimeter)
        print(distance/12)

    # define range of color in HSVccolorsolors
    lower_blue = np.array([0,0,100])
    upper_blue = np.array([170,170,170])

    
    # Threshold the HSV image to get only blue colors
    mask = cv2.inRange(hsv, lower_blue, upper_blue)
    # Threshold the HSV image to get only blue colors
    mask = cv2.inRange(hsv, lower_blue, upper_blue)
     # Bitwise-AND mask and original image
    res = cv2.bitwise_and(frame,frame, mask= mask)
    
  #  cv2.imshow('contor',contor)
    cv2.imshow('frame',gray)
    cv2.imshow('mask',mask)
    cv2.imshow('res',res)
    out.imshow('res',res)
    k = cv2.waitKey(10) & 0xFF
    if k == 27:     
        break
cap.release()
cv2.destroyAllWindows()
