
package com.example.demo.api;

import lombok.Data;

import java.util.List;

/**
 * @author peanutnowing
 */
@Data
public class ProviderInfo {

    /**
     * Provider ID：ZK注册后会生成一个ID
     * Client 获取Provider列表时，将此ID设置为获取的ZK生成的ID
     */
    String id;

    /**
     * Provider对应的后端服务器地址
     */
    String url;

    /**
     * 标签：用于简单路由
     */
    List<String> tags;

    /**
     * 权重：用于加权负载均衡
     */
    Integer weight;

    public ProviderInfo() {}

    public ProviderInfo(String id, String url, List<String> tags, int weight) {
        this.id = id;
        this.url = url;
        this.tags = tags;
        this.weight = weight;
    }
}
