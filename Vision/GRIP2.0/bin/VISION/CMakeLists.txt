cmake_minimum_required(VERSION 3.13)
project(VISION)
# Enable C++11
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED TRUE)
SET(OpenCV_DIR ~/opencv/installation/OpenCV-master/lib/cmake/opencv4)
add_executable(VISION main.cpp )
target_link_libraries(VISION ${OPENCV_LIBS})