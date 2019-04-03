import numpy as np
import cv2


cap = cv2.VideoCapture(1)
cap.set(cv2.CAP_PROP_EXPOSURE,100)
cap.set(cv2.CAP_PROP_BRIGHTNESS,50)

while(1):

    # Take each frame
    cap.set(3,12)
    _, frame = cap.read()
     

    # Convert BGR to HSV
    gray = cv2.cvtColor( frame, cv2.COLOR_BGR2GRAY )
    hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
    


    
   

    # define range of color in HSV
    lower_blue = np.array([0,0,100])
    upper_blue = np.array([170,170,170])

    
    # Threshold the HSV image to get only blue colors
    mask = cv2.inRange(hsv, lower_blue, upper_blue)
     # Bitwise-AND mask and original image
    res = cv2.bitwise_and(frame,frame, mask= mask)
    
  #  cv2.imshow('contor',contor)
    cv2.imshow('frame',gray)
    cv2.imshow('mask',mask)
    cv2.imshow('res',res)
    k = cv2.waitKey(5) & 0xFF
    if k == 27:
        break

cv2.destroyAllWindows()
