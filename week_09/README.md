# 第9周作业

### 作业要求

1.（必做）改造自定义RPC的程序，提交到GitHub：

* 尝试将服务端写死查找接口实现类变成泛型和反射；
* 尝试将客户端动态代理改成 AOP，添加异常处理；
* 尝试使用 Netty+HTTP 作为 client 端传输方式。

*代码地址：[rpc-demo](https://github.com/peanutnowing/training-2021/tree/master/homework/rpc/rpc-demo)*



2.（必做）结合 dubbo+hmily，实现一个 TCC 外汇交易处理，代码提交到 GitHub:

* 用户 A 的美元账户和人民币账户都在 A 库，使用 1 美元兑换 7 人民币 ;
* 用户 B 的美元账户和人民币账户都在 B 库，使用 7 人民币兑换 1 美元 ;
* 设计账户表，冻结资产表，实现上述两个本地事务的分布式事务。

*代码地址：[himly-tcc-dubbo](https://github.com/peanutnowing/training-2021/tree/master/homework/himly-tcc-dubbo)*

