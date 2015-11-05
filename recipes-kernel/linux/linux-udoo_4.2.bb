# Adapted from linux-imx.inc, copyright (C) 2012, 2015 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

require recipes-kernel/linux/linux-dtb.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=${SRCBRANCH} \
           file://defconfig \
          "

S = "${WORKDIR}/git"

PV .= "+git${SRCPV}"

SRCBRANCH = "linux-4.2.y"
SRCREV = "f69d603ce6ec3c6aa9033e1e54102a74e58882bb"

COMPATIBLE_MACHINE = "udoo-quad"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
