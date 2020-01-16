package com.action.netty.zip.test;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 16. 1月 2020 10:48 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDataDTO {

    private String record;

    @JSONField(name = "send_reg_time")
    private String sendRegTime;

    private String data1;

    @JSONField(name = "batch_uid")
    private String batchUid;

    public InventoryDataDTO(String sendRegTime, String data1) {
        this.record = "thirteen.inventory_data";
        this.sendRegTime = sendRegTime;
        this.data1 = data1;
        this.batchUid = "undefined";
    }
}
