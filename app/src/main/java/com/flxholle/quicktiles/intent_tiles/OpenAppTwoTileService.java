package com.flxholle.quicktiles.intent_tiles;

import com.flxholle.quicktiles.abstract_tiles.OpenCustomAppTileService;
import com.flxholle.quicktiles.utils.SharedPreferencesUtil;

public class OpenAppTwoTileService extends OpenCustomAppTileService {
    @Override
    public String getPreferencesKey() {
        return SharedPreferencesUtil.CUSTOM_PACKAGE_TWO;
    }

    @Override
    public String getLabelPreferenceKey() {
        return SharedPreferencesUtil.CUSTOM_PACKAGE_TWO_LABEL;
    }
}
