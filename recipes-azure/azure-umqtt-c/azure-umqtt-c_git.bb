DESCRIPTION = "Microsoft Azure MQTT"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-umqtt-c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e1bb384cedd6442b3a2b9a5b531e005"

SRC_URI = "\
    git://github.com/Azure/azure-umqtt-c.git;protocol=https;branch=master \
"

SRCREV = "d08d530fc3ae3f60d3f750fab6629a5b7839f754"

PV = "1.1.12+git${SRCPV}"

require ${BPN}.inc
