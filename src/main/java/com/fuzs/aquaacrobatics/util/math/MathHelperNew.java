package com.fuzs.aquaacrobatics.util.math;

public class MathHelperNew extends net.minecraft.util.math.MathHelper {

    public static float lerp(float pct, float start, float end) {
        return start + pct * (end - start);
    }

}
