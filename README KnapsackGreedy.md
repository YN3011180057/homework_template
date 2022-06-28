# 贪心算法实验报告

## 学号：20201050422

> 注:为保护同学隐私，请不要填写姓名

## 实验目的：

1. 编程实现经典的贪心算法，理解贪心算法设计的基本思想、程序实现的相关技巧，加深对贪心算法设计与分析思想的理解。通过程序的执行时间测试结果，与理论上的时间复杂度结论进行对比、分析和验证。

## 实验原理

**贪心算法的基本思想**

贪心算法求解优化问题的基本思想是：采用逐步构造最优解的方法。在每个阶段，都作出一个当前最优的决策（在一定的标准下）。决策一旦作出，就不可再更改（作出贪心决策的依据称为贪心准则）。贪心算法的一般步骤如下：

(1) 根据拟解决问题选取一种贪心准则；

(2) 按贪心准侧标准对 *n* 个候选输入排序（以这一方法为代表，仍可基于堆

来存储候选）；

(3) 依次选择输入量加入部分解中：如果当前这个输入量的加入，不满足约

束条件，则不把此输入加到这部分解中。

贪心算法的基本设计范式如下：

```
Greedy(A,n) 
A: include n inputs 
Solution=Ф
for i=1 to n do 
 x=Select(A) 
 if Feasible(solution,x) then 
 solution=Union(solution,x) 
 end if 
end for 
return solution
```

**测试算法**

背包问题是使用贪心算法求解的代表问题，算法如下：

```
KnapsackGreedy(p，w，m，x，n) 
 //v[1..n]和 w[1..n]分别含有按 vi/wiv(i+1)/v(i+1)排序的 n 
件物品的价值和重量。M 是背包的容量大小，而 x[1..n]是解向量// 
 for i=1 to n do 
xi=0 //将解向量初始化为零// 
 end for 
 cu=m //cu 是背包剩余容量// 
 for i=1 to n do 
 if wi>cu then 
exit 
end if 
 xi=1 
 cu=cu-wi 
 repeat 
 if i≤n then 
xi=cu/wi 
 end if
```

算法的时间复杂度取决于对 *v**i*/*w**i* 排序的时间复杂度，若选择 MergeSort 排序算法，则以上算法的时间复杂度为 *O*(*n*log*n*)。

## 实验输入数据集

文本数据集：背包容量固定为20，物品种类和价值随机生成
文件数据集：[数据集](https://github.com/Qqinzijin/homework_template/blob/main/data/KnapsackGreedy.txt)

## 实验内容

1. [KnapsackGreedy.java](https://github.com/Qqinzijin/homework_template/blob/main/KnapsackGreedy.java)算法实现的java版本

## 实验预期结果与实际结果

- 实验预期结果：

实验过程及实验结果（Java版，完整结果过长仅给出其中一种示例）

```
gitpod /workspace/homework_template (main) $  /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-32e54fb5/redhat.java/jdt_ws/homework_template_e40f76e0/bin KnapsackGreedy 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入物品种数n：
10
请输入背包容量m：
20
物品重量为：
7.0 19.0 18.0 15.0 17.0 18.0 9.0 18.0 12.0 7.0 
物品价值为：
10.0 14.0 6.0 9.0 1.0 9.0 13.0 9.0 18.0 1.0 
问题的解为：
0.0 1.0 0.06666667 0.0 0.0 0.0 0.0 0.0 0.0 0.0 
最优解的最终价值为：14.6
程序耗时:8214ms
```

![image-20220628100313937](C:\Users\86135\AppData\Roaming\Typora\typora-user-images\image-20220628100313937.png)

理论上的时间复杂度，该算法的时间主要消耗在将各种物品依其单位重量的价值从大到小排序。 因此，其时间复杂性为O (nlog2n)，所以随着输入种类的增多，时间将越长，呈现nlogn的增长形式，但图像并没有完美的体现这一点，这可能是由于测试次数较少，不够精确，随机数产生的偶然性，以及程序在打印数据时产生的时间也不同等各种因素导致的。