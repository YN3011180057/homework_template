# 分治算法实验报告

## 学号：20201050422

> 注:为保护同学隐私，请不要填写姓名

## 实验目的：

1. 通过排序算法的程序实现和执行时间测试，与理论上的结论进行对比分析，

   深入理解算法时间复杂度渐进性态和和增长率的概念；理解分治算法设计的基本

   思想、递归程序实现的基本方法，加深对分治算法设计与分析思想的理解。

## 实验原理

**1、算法时间复杂度分析的相关概念**

(1) 算法的计算时间取决于算法中某些操作的执行次数，这些操作是算法时

间复杂度分析的依据。增长率反映了算法的计算时间复杂度，即随着算法输入规

模的增加、算法计算时间增加的趋势。算法的计算时间复杂度针对输入数据的等

价类来分析或测试。

**2、随机数生成算法**

通过程序生成（伪）随机数，作为实验用测试数据。可使用编程语言自带的

random 函数生成，也可以采用一些有效的随机数生成算法生成，例如“线性同

余法”，基于该算法，只要参数选择合适，所产生的伪随机数就能满足均匀性和

独立性，与真正的随机数具有相近的性质。该算法的基本思想如下：

通过设置 *X**i*+1=(*aX**i*+*c*) mod *m*, *n*0，其中的 4 个整数参数：*m*——模数, *m*>0； 

*a*——乘数, 0*a*<*m*；*c*——增量, 0*c*<*m*；*X*0——开始值, 0*X*0<*m*。这样得到所求

的随机数序列{*X**i*}，称作线形同余序列。

**3、分治算法**

分治算法的基本思想是将一个规模为 *n* 的问题分解为 *k* 个规模较小的子问

题，这些子问题相互独立且与原问题性质相同。求出子问题的解，就可得到原问

题的解。分治算法设计的一般步骤包括：

(1) 分解，将要解决的问题划分成若干规模较小的同类问题；

(2) 求解，当子问题划分得足够小时，用较简单的方法解决；

(3) 合并，按原问题的要求，将子问题的解逐层合并构成原问题的解。

## 实验内容

**以冒泡排序、合并排序和快速排序算法为例**

以生成的随机数作为实验中使用的测试数据。对每个算法，记录程序执行中随着测试数据增加算法基本操作执

行次数，分析并以图形方式展现增长率；对以上三个排序算法，对比随着测试数据增加算法增长率变化趋势；测试、验证、对比算法时间复杂度的理论结论（由于输入规模100000时递归超出最大栈，所以选择输入15000）。

1. [SortTexting.java](https://github.com/Qqinzijin/homework_template/commit/84a76c4019fa5e04a4898ca9631f69297fa2f796)分治算法Java实现的版本

## 实验预期结果与实际结果

- 实验预期结果：

实验过程及实验结果（Java版）

**输入规模10：**

```
gitpod /workspace/homework_template (main) $  /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
10
冒泡算法比较操作执行21次
快速算法比较操作执行9次
快速算法递归操作执行20次
合并算法比较操作执行5次
合并算法递归操作执行18次
```

**输入规模100：**

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
100
冒泡算法比较操作执行2585次
快速算法比较操作执行99次
快速算法递归操作执行200次
合并算法比较操作执行50次
合并算法递归操作执行198次
```

**输入规模1000：**

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
1000
冒泡算法比较操作执行249765次
快速算法比较操作执行999次
快速算法递归操作执行2000次
合并算法比较操作执行500次
合并算法递归操作执行1998次
```

**输入规模10000：**

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
10000
冒泡算法比较操作执行25248414次
快速算法比较操作执行9999次
快速算法递归操作执行20000次
合并算法比较操作执行5000次
合并算法递归操作执行19998次
```

**输入规模15000：**

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
15000
冒泡算法比较操作执行56019398次
快速算法比较操作执行14999次
快速算法递归操作执行30000次
合并算法比较操作执行7500次
合并算法递归操作执行29998次
```

**柱形图表示各算法输入规模与比较次数的关系：**

![image-20220627092618499](C:\Users\86135\AppData\Roaming\Typora\typora-user-images\image-20220627092618499.png)

**两种算法执行中各子问题的规模，用表格方式记录所有情形各子问题的规模值如下：**

| 子问题规模\输入规模 | 10   | 100  | 1000 | 10000 | 15000 |
| :-----------------: | ---- | ---- | ---- | ----- | ----- |
|      快速排序       | 20   | 200  | 2000 | 20000 | 30000 |
|      归并排序       | 18   | 198  | 1998 | 19998 | 29998 |

## 实验总结

使用随机数生成方法生成包含 100 个随机数的测试数据，记录这些数据：

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
1000
冒泡算法比较操作执行249765次
快速算法比较操作执行999次
快速算法递归操作执行2000次
合并算法比较操作执行500次
合并算法递归操作执行1998次
```

再重新生成包含 100 个随机数：

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/-fe0dbf5/redhat.java/jdt_ws/homework_template_e40f76e0/bin SortTesting 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入要生成的随机数的个数:
100
冒泡算法比较操作执行2495次
快速算法比较操作执行99次
快速算法递归操作执行200次
合并算法比较操作执行50次
合并算法递归操作执行198次
```

对比两次生成的测试数据和算法执行中比较操作的次数，发现次数并无太大差别，可以大致了解到算法复杂度分析时输入数据等价类的含义，指某个**输入域的子集合，在该子集合中，各个输入数据对于揭露程序中的错误都是等效的**。除此之外，基于生成的曲线图，与时间复杂度的理论结论对比分析，明白了计算时间渐进性态和增长率的概念：**渐进时间复杂度(时间复杂度)是算法效率的度量。在一般情况下，算法基本操作重复执行的次数用T(n)表示。同时用一个辅助函数f(n)，T(n)/f(n)!=0，那么f(n)是T(n)的同数量级函数，T(n)=O(f(n))，这就称为渐进时间复杂度。** **实验中増长率最快的冒泡排序随着输入规模的增长，基本操作执行次数呈现n^2速率增长，由此可知增长率指代码块花费的时间随输入增长的速率**。