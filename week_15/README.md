# 第15周作业

### 一、作业要求

1.（必做）分别用 100 个字以上的一段话，加上一幅图（架构图或脑图），总结自己
对下列技术的关键点思考和经验认识:

* JVM
* NIO
* 并发编程
* Spring 和 ORM 等框架
* MySQL 数据库和 SQL
* 分库分表
* RPC 和微服务
* 分布式缓存
* 分布式消息队列

#### 1.JVM
![JVM](http://assets.processon.com/chart_image/61985f1607912906e6b1314d.png)
JVM是Java中重点的重点，放在了第一位，要掌握的内容包括JVM基础知识、Java字节码技术、JVM类加载器、JVM内存模型、JVM启动参数以及工具与GC策略。
看着理论知识很多，其实想要完全掌握并不容易，是需要在实践中结合理论知识掌握的知识点。
#### 2.NIO
![NIO](http://assets.processon.com/chart_image/61986ddd7d9c085b30fdb8a7.png)
NIO感觉接触的很少，其实不是这样，是Java网络这块必须掌握的知识点，特别是Netty。需要掌握Java IO、NIO的核心组件
，以及Netty框架原理，为什么Netty性能这么好，同时还要通过一些Netty的使用示例，更好的理解Netty框架，最后还需要掌握API网关。
#### 3.并发编程
![并发编程](http://assets.processon.com/chart_image/6198d40ee0b34d64eb8368ea.png)
Java并发编程也是必须掌握的，包括多线程基础、Java多线程、线程安全、并发原子类、Java并发包、线程池原理与应用、锁、并发工具类等知识点。
实际工作中，多线程无处不在，无论是一些简单的定时任务，一些需要批量处理的文件或者更有难度的高并发都离不开多线程，知识点繁多，都需要掌握。
#### 4.Spring 和 ORM 等框架
![Spring 和 ORM 等框架](http://assets.processon.com/chart_image/6198d56be401fd06e6914422.png)
Java长时间作为第一大编程语言，相应的框架也是最多的，所有框架里必须掌握的就是Spring，想绕也绕不开。需要了解Spring的技术发展、Spring的框架设计,
要掌握AOP详解、Spring Bean核心原理、Spring XML配置原理、Spring Messaging等技术、Spring Boot核心原理、Spring Boot Starter详解,此外
还需要掌握JDBC与数据库连接池、Spring/Spring Boot集成 ORM/JPA、ORM-Hiberate/MyBatis等ORM框架。

#### 5.MySQL 数据库和 SQL
![MySQL 数据库和 SQL](http://assets.processon.com/chart_image/6198f2ac5653bb308043e5a5.png)
在互联网行业工作，用到最多的关系型数据库就是MySQL，用的不是很深，但是一些知识点其实是非常有必要知道的。具体包括MySQL事务与锁、数据库原理、MySQL配置优化、
数据库设计优化、DB与SQL优化以及一些常见的场景分析。作为实际工作中，不可缺少的工具，知其然更知其所以然。
#### 6.分库分表
![分库分表](http://assets.processon.com/chart_image/612b6b32f346fb01fa47317c.png)

跟数据库有关系的额外一些知识点中，分库分表是必须掌握的。可能目前的业务量达不到分库分表的情况，但是以后肯定会遇上，
除非做的业务量不大，那这份工作也没有技术挑战了。需要掌握的知识点包括数据库垂直拆分、数据库水平拆分、相关的框架和中间件以及如何
做数据迁移等。
#### 7.RPC 和微服务
![RPC 和微服务](http://assets.processon.com/chart_image/6198fc4a5653bb308043f2c9.png)
一提到RPC就想到微服务，RPC要掌握的知识点包括RPC的基本原理、常见的PPC技术、常见的RPC框架，主要是以Dubbo为代表的。
学习完了相关知识，可以自己设计一个RPC框架。从RPC到分布式服务化，详细了解下什么是分布式服务化。
#### 8.分布式缓存
![分布式缓存](http://assets.processon.com/chart_image/6198fc7de0b34d64eb839d6f.png
)
为什么会使用分布式缓存？在互联网项目中，缓存无处不在，缓存的种类也分几种，主要分为本地缓存和远程缓存。
远程缓存的代表就是Redis,可以说用好Redis，分布式缓存就算掌握了。Redis知识点很多，包括基本功能、使用场景、Redis集群
与高可用等。同时一些常用的缓存策略需要了解，常见的缓存问题能解决，比如缓存穿透、缓存击穿和缓存雪崩等。
#### 9.分布式消息队列
![分布式消息队列](http://assets.processon.com/chart_image/6198f3af07912906e6b21345.png)
分布式消息队列需要先掌握消息队列的基础，比如消息模式、消息协议等，其次找一个常用的分布式消息队列作为学习的对象，
比如RocketMQ，通过学习实例，深入了解原理。有很多MQ，这里面不得不提Kafka,通过学习Kafka概念和入门知识，掌握Kafka
的基简单实用，后续掌握更高级的特性以及集群配置等知识点。
### 二、毕业总结
不知不觉，感觉几个月的训练营很快就结束了，逐渐适应了每周一个或者几个知识点，同时每周都会有作业。虽然每周都完成了作业，但是整体自我感觉
并不好，完成的都是最简单的，没有太多的技术含量。

职业培训并不是在学校那种教育，作业都没有强制要求，不完成也没有任何惩罚，成年人全靠自觉。虽然工作很忙，但这都不是理由。
多找方法，少找借口，哪里不行抓紧时间补哪里。

这几个月还是有些收获的，后续准备把一些重点知识点重新看几遍，做那些更有难度的题，多一些思考以及做更多的实践。
