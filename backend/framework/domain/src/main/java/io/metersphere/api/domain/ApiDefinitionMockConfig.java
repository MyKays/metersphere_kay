
package io.metersphere.api.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.metersphere.validation.groups.Updated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "mock期望值配置")
@TableName("api_definition_mock_config")
@Data
public class ApiDefinitionMockConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    @NotBlank(message = "{api_definition_mock_config.api_definition_mock_id.not_blank}", groups = {Updated.class})
    @ApiModelProperty(name = "接口mock pk", required = true, allowableValues = "range[1, 50]")
    private String apiDefinitionMockId;

    @ApiModelProperty(name = "请求内容", required = false, allowableValues = "range[1, ]")
    private byte[] request;

    @ApiModelProperty(name = "响应内容", required = false, allowableValues = "range[1, ]")
    private byte[] response;

}