package cff.model;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class G {
    public static final String G_HH_ZERO ="ZERO";
    private boolean isGSee;
    private enum pSize {VERY_BIG, BIG, MIDDLE, SMALL, MICRO};
    private enum pColor {WHITE, ROSE, YELLOW, BROWN};
    private boolean isC;
    private boolean gHHExist;
    private String gHHZero;
    // TODO: 26.02.2019 If gHHExist is FALSE then field gHHZero is G_HH_ZERO;  
    // TODO: 26.02.2019 If isGSee is TRUE then g-fields are visible and accessible;
    // TODO: 26.02.2019 If gHHExist is TRUE then fields gHHColor and gHHNumber are visible and accessible;
    private enum gHHNumber {VERY_MUCH, MUCH, MIDDLE, FEW, VERY_FEW};
    private enum gHHColor {HBR, HSH, HBL, HRZ};
    private boolean pAsEl;
    private boolean pTypeKzJO;
    private enum tSize {VERY_BIG, BIG, MIDDLE, SMALL, MICRO};
    private enum tType {D, T, S};

}
