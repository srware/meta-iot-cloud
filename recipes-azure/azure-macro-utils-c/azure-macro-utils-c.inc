inherit cmake

B = "${WORKDIR}/build"

EXTRA_OECMAKE = "\
    -DCMAKE_POLICY_VERSION_MINIMUM=3.5 \
"

sysroot_stage_all:append () {
    sysroot_stage_dir ${D}${exec_prefix}/cmake ${SYSROOT_DESTDIR}${exec_prefix}/cmake
}

FILES:${PN}-dev += "\
    ${exec_prefix}/cmake \
"

ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"
