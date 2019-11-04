package org.egov.pg.models.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentModeEnum {
    CASH("CASH"),
    CHEQUE("CHEQUE"),
    DD("DD"),
    ONLINE("ONLINE"),
    CARD("CARD");


    private String value;

    PaymentModeEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    public static boolean contains(String test) {
        for (PaymentModeEnum val : PaymentModeEnum.values()) {
            if (val.name().equalsIgnoreCase(test)) {
                return true;
            }
        }
        return false;
    }

    @JsonCreator
    public static PaymentModeEnum fromValue(String text) {
        for (PaymentModeEnum b : PaymentModeEnum.values()) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
