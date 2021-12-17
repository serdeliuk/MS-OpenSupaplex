# MS-OpenSupaplex [![download](https://img.shields.io/github/downloads/serdeliuk/MS-OpenSupaplex/total)](https://github.com/serdeliuk/MS-OpenSupaplex/releases/download/1/msopensupaplex-ipk-packages.zip)

### OpenSuppaplex ported to Vu Solo4K Enigma2 ARM STB box


#### This source code is licensed under [GNU GPLv3](https://www.gnu.org/licenses/gpl-3.0.html#preamble)
#### Please read LICENSE.txt for more details

#### This repository contain openembedded bitbake recipes for OpenSupaplex game and MS-OpenSupaplex Enigma2 plugin
- OpenSupaplex
- MS-OpenSupaplex enigma2 plugin

## Usage
### The provided prebuilt OpenSupaplex have only those Remote Control keys implemented at this time
- Arrow keys
- BLUE mapped to `right shift`
- Exit mapped to ESC key
- OK mapped to enter/return
- Info/EPG mapped to SPACE

### Install
- This version of OpenSupaplex is built around SDL2 library and because the SDL library does not have remote control keys you should use the provided library or if you build yourself the SDL library you need to patch yourself the library, [OpenPli](https://github.com/OpenPLi/openpli-oe-core/tree/develop/meta-openpli/recipes-graphics/libsdl2) developemnt branch have my patch to add all known remote control keys to SDL2 library
- The package archive contain all libraries and apps you need to install and run the OpenSupaplex game on your Vu+ Solo4K all tested and build under OpenPli 8.1
- It is included a setup.sh script to install the packages in the right order.

### Special thanks
- [cilliemalan](https://github.com/cilliemalan/supaplex)
- [sergiou87](https://github.com/sergiou87/open-supaplex)

Enjoy!!!<br>


[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://paypal.me/serdeliuk) any donation is highly appreciated!

