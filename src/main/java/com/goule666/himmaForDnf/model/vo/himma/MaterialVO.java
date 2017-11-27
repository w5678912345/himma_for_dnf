package com.goule666.himmaForDnf.model.vo.himma;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * @author niewenlong
 * @Date 2017/11/27 Time: 9:38
 * @Description
 */
@ApiModel(value = "MaterialVO", description = "下拉框内容(搬砖材料)")
public class MaterialVO {

    @ApiModelProperty(value = "序号")
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "价格")
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}