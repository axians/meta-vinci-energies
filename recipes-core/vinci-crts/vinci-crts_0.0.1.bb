SUMMARY = "Install trusted certificates"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://zscaler-root-ca.crt"

S = "${WORKDIR}"

FILES:${PN} += "/usr/local/share/ca-certificates/zscaler-root-ca.crt"

do_install() {
             
    # Install certificates
    install -d ${D}/usr/local/share/ca-certificates
    install -m 0444 ${WORKDIR}/zscaler-root-ca.crt ${D}/usr/local/share/ca-certificates
}

