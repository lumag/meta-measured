SUMMARY = "The tpm-tools package contains commands to allow the platform administrator the ability to manage and diagnose the platform's TPM."
DESCRIPTION = " \
  The tpm-tools package contains commands to allow the platform administrator \
  the ability to manage and diagnose the platform's TPM.  Additionally, the \
  package contains commands to utilize some of the capabilities available \
  in the TPM PKCS#11 interface implemented in the openCryptoki project. \
  "
SECTION = "tpm"
PR = "r0"
LICENSE = "CPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059e8cd6165cb4c31e351f2b69388fd9"

DEPENDS = "libtspi openssl"

SRC_URI += " \
    http://downloads.sourceforge.net/project/trousers/tpm-tools/${PV}/${PN}-${PV}.tar.gz;subdir=${PN}-${PV} \
"

S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "1532293aa632a0eaa7e60df87c779855"
SRC_URI[sha256sum] = "9cb714e2650826e2e932f65bc0ba9d61b927dc5fea47f2c2a2b64f0fdfcbfa68"

inherit autotools gettext
