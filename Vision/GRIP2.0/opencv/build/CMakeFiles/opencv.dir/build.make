# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.10

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build

# Include any dependencies generated for this target.
include CMakeFiles/opencv.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/opencv.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/opencv.dir/flags.make

CMakeFiles/opencv.dir/main.cpp.o: CMakeFiles/opencv.dir/flags.make
CMakeFiles/opencv.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/opencv.dir/main.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/opencv.dir/main.cpp.o -c /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/main.cpp

CMakeFiles/opencv.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv.dir/main.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/main.cpp > CMakeFiles/opencv.dir/main.cpp.i

CMakeFiles/opencv.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv.dir/main.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/main.cpp -o CMakeFiles/opencv.dir/main.cpp.s

CMakeFiles/opencv.dir/main.cpp.o.requires:

.PHONY : CMakeFiles/opencv.dir/main.cpp.o.requires

CMakeFiles/opencv.dir/main.cpp.o.provides: CMakeFiles/opencv.dir/main.cpp.o.requires
	$(MAKE) -f CMakeFiles/opencv.dir/build.make CMakeFiles/opencv.dir/main.cpp.o.provides.build
.PHONY : CMakeFiles/opencv.dir/main.cpp.o.provides

CMakeFiles/opencv.dir/main.cpp.o.provides.build: CMakeFiles/opencv.dir/main.cpp.o


# Object files for target opencv
opencv_OBJECTS = \
"CMakeFiles/opencv.dir/main.cpp.o"

# External object files for target opencv
opencv_EXTERNAL_OBJECTS =

opencv: CMakeFiles/opencv.dir/main.cpp.o
opencv: CMakeFiles/opencv.dir/build.make
opencv: CMakeFiles/opencv.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable opencv"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/opencv.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/opencv.dir/build: opencv

.PHONY : CMakeFiles/opencv.dir/build

CMakeFiles/opencv.dir/requires: CMakeFiles/opencv.dir/main.cpp.o.requires

.PHONY : CMakeFiles/opencv.dir/requires

CMakeFiles/opencv.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/opencv.dir/cmake_clean.cmake
.PHONY : CMakeFiles/opencv.dir/clean

CMakeFiles/opencv.dir/depend:
	cd /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build /home/nicktheacker/5740-Deep-Space/Vision/GRIP2.0/opencv/build/CMakeFiles/opencv.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/opencv.dir/depend

