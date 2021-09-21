cmake_minimum_required(VERSION 3.10.2)

add_library( # Sets the name of the library.
        native-lib

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        native-lib.c)

target_link_libraries(
        native-lib
        android
        log)