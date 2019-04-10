# Make error log 
### nicktheacker@nicktheacker-HP-Laptop-17-by0xxx:~/5740-Deep-Space/Vision/GRIP2.0/opencv/build$ make all
#### Scanning dependencies of target opencv
#### [ 50%] Linking CXX executable opencv
#### CMakeFiles/opencv.dir/main.cpp.o: In function `cv::Mat::~Mat()':
#### main.cpp:(.text._ZN2cv3MatD2Ev[_ZN2cv3MatD5Ev]+0x39): undefined reference to `cv::fastFree(void*)'
#### CMakeFiles/opencv.dir/main.cpp.o: In function `cv::Mat::release()':
#### main.cpp:(.text._ZN2cv3Mat7releaseEv[_ZN2cv3Mat7releaseEv]+0x4b): undefined reference to `cv::Mat::deallocate()'
### collect2: error: ld returned 1 exit status
#### CMakeFiles/opencv.dir/build.make:94: recipe for target 'opencv' failed
### make[2]: *** [opencv] Error 1
#### CMakeFiles/Makefile2:67: recipe for target 'CMakeFiles/opencv.dir/all' failed
### make[1]: *** [CMakeFiles/opencv.dir/all] Error 2
### Makefile:83: recipe for target 'all' failed
### make: *** [all] Error 2