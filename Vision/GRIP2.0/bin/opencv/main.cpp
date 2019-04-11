#include <iostream>
#include <stdio.h>
#include "opencv2/core.hpp"
#include "opencv2/videoio/videoio.hpp"
#include "opencv3/opencv2/highgui/highgui.hpp"

using namespace std;
using namespace cv;

int main(int argc, char** argv )
{
    VideoCapture cap;

    cap.open(0);

    waitKey(0);
    return 0;
}