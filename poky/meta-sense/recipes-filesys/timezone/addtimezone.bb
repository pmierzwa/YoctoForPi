DESCRIPTON = "Add timezone files"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Recipe revision - don't forget to 'bump' when a new revision is created !
PR = "r0"

BB_STRICT_CHECKSUM = "0"

FILES_${PN} += "/usr/*"

SRC_URI = "              \
   file://Copenhagen \
   file://iso3166.tab \
   file://zone1970.tab \
   "


# This function is responsible for:
#  1) Ensuring the required directories exist in the image;
#  2) Installing the scripts in to the image;
#  3) Creating the desired runlevel links to the scripts.
#
do_install() {

    install -d ${D}/usr/share/zoneinfo
    install -d ${D}/usr/share/zoneinfo/Europe

    install -m 0755 ${WORKDIR}/Copenhagen  ${D}/usr/share/zoneinfo/Europe/
    install -m 0755 ${WORKDIR}/iso3166.tab  ${D}/usr/share/zoneinfo/
    install -m 0755 ${WORKDIR}/zone1970.tab  ${D}/usr/share/zoneinfo/
}
