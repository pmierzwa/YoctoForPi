DESCRIPTON = "Add timezone files"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Recipe revision - don't forget to 'bump' when a new revision is created !
PR = "r0"

BB_STRICT_CHECKSUM = "0"

FILES_${PN} += "/home/*"

SRC_URI = "              \
   file://Sense \
   "


# This function is responsible for:
#  1) Ensuring the required directories exist in the image;
#  2) Installing the scripts in to the image;
#  3) Creating the desired runlevel links to the scripts.
#
do_install() {
    install -d ${D}/home/root/	
    install ${WORKDIR}/Sense  ${D}/home/root/
}
