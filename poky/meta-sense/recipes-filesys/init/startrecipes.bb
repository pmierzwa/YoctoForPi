DESCRIPTON = "Startup scripts"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Recipe revision - don't forget to 'bump' when a new revision is created !
PR = "r0"

BB_STRICT_CHECKSUM = "0"

SRC_URI = "              \
   file://startup-script \
   "


# This function is responsible for:
#  1) Ensuring the required directories exist in the image;
#  2) Installing the scripts in to the image;
#  3) Creating the desired runlevel links to the scripts.
#
do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d

    install -m 0755 ${WORKDIR}/startup-script  ${D}${sysconfdir}/init.d/

    ln -sf ../init.d/startup-script  ${D}${sysconfdir}/rcS.d/S90startup-script
}
