#!/bin/bash 
tput setaf 3; 
cat <<"EOF"
  ______   ______   __   ______     __       __   ______   ______       __   __   __   ______   ______  ______   __       __       ______   ______   
 /\  ___\ /\  == \ /\ \ /\  == \   /\ \     /\ \ /\  == \ /\  ___\     /\ \ /\ "-.\ \ /\  ___\ /\__  _\/\  __ \ /\ \     /\ \     /\  ___\ /\  == \  
 \ \ \__ \\ \  __< \ \ \\ \  _-/   \ \ \____\ \ \\ \  __< \ \___  \    \ \ \\ \ \-.  \\ \___  \\/_/\ \/\ \  __ \\ \ \____\ \ \____\ \  __\ \ \  __<  
  \ \_____\\ \_\ \_\\ \_\\ \_\      \ \_____\\ \_\\ \_____\\/\_____\    \ \_\\ \_\\"\_\\/\_____\  \ \_\ \ \_\ \_\\ \_____\\ \_____\\ \_____\\ \_\ \_\
   \/_____/ \/_/ /_/ \/_/ \/_/       \/_____/ \/_/ \/_____/ \/_____/     \/_/ \/_/ \/_/ \/_____/   \/_/  \/_/\/_/ \/_____/ \/_____/ \/_____/ \/_/ /_/
EOF
tput setaf 6 ;
echo ==================================================================================================================================================
echo 
echo 
echo
tput setaf 7 ;
echo "UPDATEING program list"
tput setaf 3 ;
sudo apt update 
sudo apt install python
sudo apt install python-pip
sudo apt install python3=pip
sudo apt-get install cmake
sudo apt-get install python-devel numpy
sudo apt-get install gcc gcc-c++
sudo apt-get install gtk2-devel
sudo apt-get install libv4l-devel
sudo apt-get install ffmpeg-devel
sudo apt-get install gstreamer-plugins-base-devel

clear 
tput setaf 3; 
cat <<"EOF"
  ______   ______   __   ______     __       __   ______   ______       __   __   __   ______   ______  ______   __       __       ______   ______   
 /\  ___\ /\  == \ /\ \ /\  == \   /\ \     /\ \ /\  == \ /\  ___\     /\ \ /\ "-.\ \ /\  ___\ /\__  _\/\  __ \ /\ \     /\ \     /\  ___\ /\  == \  
 \ \ \__ \\ \  __< \ \ \\ \  _-/   \ \ \____\ \ \\ \  __< \ \___  \    \ \ \\ \ \-.  \\ \___  \\/_/\ \/\ \  __ \\ \ \____\ \ \____\ \  __\ \ \  __<  
  \ \_____\\ \_\ \_\\ \_\\ \_\      \ \_____\\ \_\\ \_____\\/\_____\    \ \_\\ \_\\"\_\\/\_____\  \ \_\ \ \_\ \_\\ \_____\\ \_____\\ \_____\\ \_\ \_\
   \/_____/ \/_/ /_/ \/_/ \/_/       \/_____/ \/_/ \/_____/ \/_____/     \/_/ \/_/ \/_/ \/_____/   \/_/  \/_/\/_/ \/_____/ \/_____/ \/_____/ \/_/ /_/
EOF
tput setaf 6 ;
echo ==================================================================================================================================================
echo 
tput setaf 7 ;
echo "installing open cv"
tput setaf 3 ;
sudo pip install pip --upgrade 
sudo pip install pynetworktables
sudo pip3 install --no-build-isolation robotpy-cscore
sudo apt-get install libpng-devel
sudo apt-get install libjpeg-turbo-devel
sudo apt-get install jasper-devel
sudo apt-get install openexr-devel
sudo apt-get install libtiff-devel
sudo apt-get install libwebp-devel
sudo apt install gstreamer1.0* libgstreamer-plugins-bad1.0-0 libgstreamer-plugins-base1.0-0 libgstreamer-plugins-base1.0-dev libgstreamer1.0 libgstreamer1.0-dev libgstreamer-plugins-base1.0-dev libgtk-3-dev
sudo apt install git 

git clone git clone https://github.com/opencv/opencv.git
cd ~/opencv
mkdir build 
cd build 
cmake ../
make 
sudo make install
pip install --upgrade imutils
tput setaf 7; 
cat <<"EOF"

 __/\\\\\\\\\\\\\\\_________________________________________/\\\________________________________/\\\________                                        
 _\/\\\///////////_________________________________________\/\\\_______________________________\/\\\________                                       
  _\/\\\______________/\\\________________/\\\______________\/\\\_______________________________\/\\\________                                      
   _\/\\\\\\\\\\\_____\///___/\\/\\\\\\___\///___/\\\\\\\\\\_\/\\\_____________/\\\\\\\\_________\/\\\________                                     
    _\/\\\///////_______/\\\_\/\\\////\\\___/\\\_\/\\\//////__\/\\\\\\\\\\____/\\\/////\\\___/\\\\\\\\\___/\\\_                                    
     _\/\\\_____________\/\\\_\/\\\__\//\\\_\/\\\_\/\\\\\\\\\\_\/\\\/////\\\__/\\\\\\\\\\\___/\\\////\\\__\///__                                   
      _\/\\\_____________\/\\\_\/\\\___\/\\\_\/\\\_\////////\\\_\/\\\___\/\\\_\//\\///////___\/\\\__\/\\\________                                  
       _\/\\\_____________\/\\\_\/\\\___\/\\\_\/\\\__/\\\\\\\\\\_\/\\\___\/\\\__\//\\\\\\\\\\_\//\\\\\\\/\\__/\\\_                                 
        _\///______________\///__\///____\///__\///__\//////////__\///____\///____\//////////___\///////\//__\///__                                
__/\\\\____________/\\\\________________________/\\\____________________________/\\\\\\\\\\\\\_________________                                    
 _\/\\\\\\________/\\\\\\_______________________\/\\\___________________________\/\\\/////////\\\_______________                                   
  _\/\\\//\\\____/\\\//\\\_______________________\/\\\___________________________\/\\\_______\/\\\____/\\\__/\\\_                                  
   _\/\\\\///\\\/\\\/_\/\\\__/\\\\\\\\\___________\/\\\______/\\\\\\\\____________\/\\\\\\\\\\\\\\____\//\\\/\\\__                                 
    _\/\\\__\///\\\/___\/\\\_\////////\\\_____/\\\\\\\\\____/\\\/////\\\___________\/\\\/////////\\\____\//\\\\\___                                
     _\/\\\____\///_____\/\\\___/\\\\\\\\\\___/\\\////\\\___/\\\\\\\\\\\____________\/\\\_______\/\\\_____\//\\\____                               
      _\/\\\_____________\/\\\__/\\\/////\\\__\/\\\__\/\\\__\//\\///////_____________\/\\\_______\/\\\__/\\_/\\\_____                              
       _\/\\\_____________\/\\\_\//\\\\\\\\/\\_\//\\\\\\\/\\__\//\\\\\\\\\\___________\/\\\\\\\\\\\\\/__\//\\\\/______                             
        _\///______________\///___\////////\//___\///////\//____\//////////____________\/////////////_____\////________                            
__/\\\\\_____/\\\______________________/\\\________________________/\\\\\\________________________________                                         
 _\/\\\\\\___\/\\\_____________________\/\\\_______________________\////\\\________________________________                                        
  _\/\\\/\\\__\/\\\__/\\\_______________\/\\\__________________________\/\\\________________________________                                       
   _\/\\\//\\\_\/\\\_\///______/\\\\\\\\_\/\\\_____________/\\\\\_______\/\\\_____/\\\\\\\\\_____/\\\\\\\\\\_                                      
    _\/\\\\//\\\\/\\\__/\\\___/\\\//////__\/\\\\\\\\\\____/\\\///\\\_____\/\\\____\////////\\\___\/\\\//////__                                     
     _\/\\\_\//\\\/\\\_\/\\\__/\\\_________\/\\\/////\\\__/\\\__\//\\\____\/\\\______/\\\\\\\\\\__\/\\\\\\\\\\_                                    
      _\/\\\__\//\\\\\\_\/\\\_\//\\\________\/\\\___\/\\\_\//\\\__/\\\_____\/\\\_____/\\\/////\\\__\////////\\\_                                   
       _\/\\\___\//\\\\\_\/\\\__\///\\\\\\\\_\/\\\___\/\\\__\///\\\\\/____/\\\\\\\\\_\//\\\\\\\\/\\__/\\\\\\\\\\_                                  
        _\///_____\/////__\///_____\////////__\///____\///_____\/////_____\/////////___\////////\//__\//////////__                                 
__/\\\\\\\\\\\\\____/\\\\\\________________________________________________/\\\____________________________________________________________        
 _\/\\\/////////\\\_\////\\\__________________________________/\\\_________\/\\\____________________________________________________________       
  _\/\\\_______\/\\\____\/\\\_________________________________\/\\\_________\/\\\____________________________________________________________      
   _\/\\\\\\\\\\\\\\_____\/\\\_____/\\\\\\\\\________/\\\\\\\\_\/\\\\\\\\____\/\\\_________/\\\____/\\\__/\\/\\\\\\\___/\\/\\\\\\_____________     
    _\/\\\/////////\\\____\/\\\____\////////\\\_____/\\\//////__\/\\\////\\\__\/\\\\\\\\\__\/\\\___\/\\\_\/\\\/////\\\_\/\\\////\\\____________    
     _\/\\\_______\/\\\____\/\\\______/\\\\\\\\\\___/\\\_________\/\\\\\\\\/___\/\\\////\\\_\/\\\___\/\\\_\/\\\___\///__\/\\\__\//\\\___________   
      _\/\\\_______\/\\\____\/\\\_____/\\\/////\\\__\//\\\________\/\\\///\\\___\/\\\__\/\\\_\/\\\___\/\\\_\/\\\_________\/\\\___\/\\\___________  
       _\/\\\\\\\\\\\\\/___/\\\\\\\\\_\//\\\\\\\\/\\__\///\\\\\\\\_\/\\\_\///\\\_\/\\\\\\\\\__\//\\\\\\\\\__\/\\\_________\/\\\___\/\\\___________ 
        _\/////////////____\/////////___\////////\//_____\////////__\///____\///__\/////////____\/////////___\///__________\///____\///____________




EOF
