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
echo "installing pip package's"
tput setaf 3 ;
sudo pip install opencv-contrib-python-headless
sudo pip install networktables
sudo pip install numpy
sudo pip install math
clear 
tput setaf 3; 
cat <<"EOF"

 _________    _____      __      _    _____    _____   __    __    _____   ______        ________   __    __     ____        __      _    __   ___     __      __    ____     __    __ 
(_   _____)  (_   _)    /  \    / )  (_   _)  / ____\ (  \  /  )  / ___/  (_  __ \      (___  ___) (  \  /  )   (    )      /  \    / )  () ) / __)    ) \    / (   / __ \    ) )  ( ( 
  ) (___       | |     / /\ \  / /     | |   ( (___    \ (__) /  ( (__      ) ) \ \         ) )     \ (__) /    / /\ \     / /\ \  / /   ( (_/ /        \ \  / /   / /  \ \  ( (    ) )
 (   ___)      | |     ) ) ) ) ) )     | |    \___ \    ) __ (    ) __)    ( (   ) )       ( (       ) __ (    ( (__) )    ) ) ) ) ) )   ()   (          \ \/ /   ( ()  () )  ) )  ( ( 
  ) (          | |    ( ( ( ( ( (      | |        ) )  ( (  ) )  ( (        ) )  ) )        ) )     ( (  ) )    )    (    ( ( ( ( ( (    () /\ \          \  /    ( ()  () ) ( (    ) )
 (   )        _| |__  / /  \ \/ /     _| |__  ___/ /    ) )( (    \ \___   / /__/ /        ( (       ) )( (    /  /\  \   / /  \ \/ /    ( (  \ \          )(      \ \__/ /   ) \__/ ( 
  \_/        /_____( (_/    \__/     /_____( /____/    /_/  \_\    \____\ (______/         /__\     /_/  \_\  /__(  )__\ (_/    \__/     ()_)  \_\        /__\      \____/    \______/ 
                                                                                                                                                                                       


EOF
