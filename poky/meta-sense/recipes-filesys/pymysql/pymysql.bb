# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Pure Python MySQL Driver"
HOMEPAGE = "https://github.com/PyMySQL/PyMySQL/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=528175c84163bb800d23ad835c7fa0fc"

SRC_URI = "git://github.com/PyMySQL/PyMySQL;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "c51b47e3c6fa0d8b8090a6b25f7168ed68082dea"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
# RDEPENDS_${PN} += "python-core"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    ConfigParser
#    __builtin__
#    __future__
#    cStringIO
#    configparser
#    datetime
#    decimal
#    functools
#    getpass
#    hashlib
#    imp
#    io
#    json
#    os
#    re
#    socket
#    ssl
#    struct
#    traceback
#    unittest
#    unittest2
#    warnings


