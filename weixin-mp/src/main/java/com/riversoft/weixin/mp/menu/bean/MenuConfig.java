package com.riversoft.weixin.mp.menu.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.riversoft.weixin.common.util.BooleanDeserializer;
import com.riversoft.weixin.common.util.BooleanSerializer;

/**
 * @borball on 5/26/2016.
 */
public class MenuConfig {

    @JsonProperty("is_menu_open")
    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonSerialize(using = BooleanSerializer.class)
    private boolean enabled;

    @JsonProperty("selfmenu_info")
    private MenuInfo menu;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public MenuInfo getMenu() {
        return menu;
    }

    public void setMenu(MenuInfo menu) {
        this.menu = menu;
    }
}