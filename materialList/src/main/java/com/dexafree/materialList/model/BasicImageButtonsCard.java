package com.dexafree.materialList.model;

import com.dexafree.materialList.R;
import com.dexafree.materialList.controller.OnButtonPressListener;

public class BasicImageButtonsCard extends Card {

    private String leftButtonText;
    private String rightButtonText;
    private OnButtonPressListener mListener;
    private boolean showDivider = false;
    private boolean fullDividerLength = false;


    public String getLeftButtonText() {
        return leftButtonText;
    }

    public void setLeftButtonText(String leftButtonText) {
        this.leftButtonText = leftButtonText;
    }

    public String getRightButtonText() {
        return rightButtonText;
    }

    public void setRightButtonText(String rightButtonText) {
        this.rightButtonText = rightButtonText;
    }

    public boolean getShowDivider() {
        return showDivider;
    }

    public boolean getFullDividerLength() {
        return fullDividerLength;
    }

    public void setFullDividerLength(boolean fullDividerLength) {
        this.fullDividerLength = fullDividerLength;
    }

    public void setShowDivider(boolean showDivider) {
        this.showDivider = showDivider;
    }

    public OnButtonPressListener getOnButtonPressedListener() {
        return mListener;
    }

    public void setOnButtonPressListener(OnButtonPressListener listener) {
        this.mListener = listener;
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_image_buttons_card_layout;
    }

}
