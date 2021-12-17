SUMMARY = "MS-OpenSupaplex E2 Plugin | Supaplex is a game made in the early nineties."
MAINTAINER = "Marc Serdeliuc"
HOMEPAGE = "https://github.com/serdeliuk/MS-OpenSupaplex"
SOURCE = "https://github.com/serdeliuk/MS-OpenSupaplex"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

PACKAGE_ARCH = "${DEFAULTTUNE}"

PV = "0.2"
PR = "r1"
PN = "enigma2-plugin-extensions-msopensupaplex"

PROVIDES = "enigma2-plugin-extensions-msopensupaplex"
#RPROVIDES_${PN} += "enigma2-plugin-extensions-msopensupaplex"

SRC_URI = "file://*"
S = "${WORKDIR}/"

FILES_${PN} += "/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex"

inherit autotools-brokensep

pkg_postrm_${PN}() {
rm -rf /usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex
}
