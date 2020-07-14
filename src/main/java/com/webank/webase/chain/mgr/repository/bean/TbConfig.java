package com.webank.webase.chain.mgr.repository.bean;

import java.io.Serializable;
import java.util.Date;

import com.webank.webase.chain.mgr.base.enums.ConfigTypeEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class TbConfig implements Serializable {
    public static TbConfig init(ConfigTypeEnum type, String value){
        Date now = new Date();

        TbConfig config = new TbConfig();
        config.setConfigName(type.getName());
        config.setConfigType(type.getId());
        config.setConfigValue(value);
        config.setCreateTime(now);
        config.setModifyTime(now);

        return config;
    }


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.config_name
     *
     * @mbg.generated
     */
    private String configName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.config_type
     *
     * @mbg.generated
     */
    private Integer configType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.config_value
     *
     * @mbg.generated
     */
    private String configValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_config
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}