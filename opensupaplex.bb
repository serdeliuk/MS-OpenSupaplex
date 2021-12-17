SUMMARY = "OpenSupaplex | Supaplex is a game made in the early nineties."
HOMEPAGE = "https://github.com/sergiou87/open-supaplex"

MAINTAINER = "Marc Serdeliuc <serdeliuk@yahoo.com>"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Makefile;md5=6d8e3daa860e1498762cec81e7a7cee6"

SRC_URI = " \
    git://github.com/sergiou87/open-supaplex;branch=master;protocol=https \
    file://000.create.Makefile.patch;patch=1 \
    file://002.create.missing.cfg.files.patch \
    file://003.add.ir.rc.keys.patch \
    file://004.fix.video.color.resize.patch \
    file://005.fix.audio.patch \
    file://music-beep.flac \
    file://music-blaster.flac \
    file://music-roland.flac \
    file://${WORKDIR}/git/resources/* \
"

SRCREV = "a4dc47edcf76dda524f383ddfcb22984a3549382"
PV = "0.2"
PR = "r1"

PROVIDES += "opensupaplex"

DEPENDS = " \
    libsdl2 \
    libsdl2-mixer \
"

RDEPENDS_${PN} = " \
    libsdl2 \
    libsdl2-mixer \
    directfb \
    libasound-module-pcm-oss \
    enigma2-plugin-extensions-msopensupaplex \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/git"

EXTRA_OECONF += " --with-sdl --prefix=/usr"

FILES_${PN} += "/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game"

inherit pkgconfig

do_install () {
        install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game
        install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game/audio
	cp ${S}/opensupaplex ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game
	cp ${S}/*.CFG ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game
	cp ${S}/*.LST ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game
	rm -rf ${WORKDIR}/git/resources/audio/*.xm
	cp ${WORKDIR}/*.flac ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game/audio
	cp -r ${WORKDIR}/git/resources/* ${D}/usr/lib/enigma2/python/Plugins/Extensions/MS-OpenSupaplex/game
}
