package app.template.patches.shared

import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.ApkFileType

val WALLVERSE_COMPATIBILITY = Compatibility(
    name = "Wallverse",
    packageName = "com.wallverse.wallpapers",
    apkFileType = ApkFileType.XAPK,
    minVersion = "4.2",
    maxVersion = "4.2",
    patches = listOf(
        "wallverseUnlockPremiumPatch",
        "wallverseCustomBrandingPatch"
    )
)