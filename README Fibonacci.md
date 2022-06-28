# 动态规划算法2.2实验报告

## 学号：20201050422

> 注:为保护同学隐私，请不要填写姓名

## 实验目的：

1. 对于同一问题，编程实现其分治算法和动态规划算法，通过对比分析，理解动态规划算法的适用情形。通过程序的执行时间测试结果，与理论结论进行对比、分析和验证。

## 实验原理

**分治算法与动态规划算法的对比：针对子问题是否重叠**

虽然很多问题均可分解为子问题、动态规划和分治算法都是通过子问题的解决来获得原问题的解。然而，分治算法适用于子问题不重叠（即相互独立）的情形，对于子问题重叠的情形分治法具有较高的时间复杂度，动态规划是针对这类情形的有效算法。

**测试算法**

斐波纳契数列在现代物理、准晶体结构、化学等领域都有直接的应用。斐波那契数列指的是这样一个数列：1、1、2、3、5、8、13、21、……，这个数列从第三项开始，每一项都等于前两项之和，即：

![image-20220627230046673](C:\Users\86135\AppData\Roaming\Typora\typora-user-images\image-20220627230046673.png)

直观地，斐波纳契数列可递归地得到，算法如下：

```
DAC_f(n) 
if(n==1) or (n==2) then 
 return 1 
else 
return f(n-1)+f(n-2) 
end if
```

通过理论分析已经得出结论：以上递归算法随着 *n* 增大有指数计算时间。对于 *n* 的多项式个数的子问题，显然指数计算时间是不现实的。基于动态规划算法可高效地求解 Fibonacci 数问题，算法如下：

```
DP_f(n) 
Initialize f[1..n] 
for i=1 to n do 
if(i==1) or (i==2) then 
 f[i]=1 
else 
f[i]=f[i-1]+f[i-2] 
end if 
end for 
return f[n]
```

算法的时间复杂度为 *O*(*n*)。

## 实验输入数据集

文本数据集：随机生成
文件数据集：[数据集](https://github.com/Qqinzijin/homework_template/blob/main/data/Fibonacci.txt)

## 实验内容

1. [Fibonacci.java](https://github.com/Qqinzijin/homework_template/blob/main/Fibonacci.java)算法实现的java版本

## 实验预期结果与实际结果

- 实验预期结果：

实验过程及实验结果（Java版）

```
gitpod /workspace/homework_template (main) $  /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/5c2e7e2d/redhat.java/jdt_ws/homework_template_e40f76e0/bin Fibonacci 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入n值：
5
递归法执行次数：7次
递归法执行时间：0.0ms
动态规划法执行次数：4次
动态规划法执行时间：0.0ms
```

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/5c2e7e2d/redhat.java/jdt_ws/homework_template_e40f76e0/bin Fibonacci 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入n值：
10
递归法执行次数：88次
递归法执行时间：0.0ms
动态规划法执行次数：9次
动态规划法执行时间：0.0ms
```

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/5c2e7e2d/redhat.java/jdt_ws/homework_template_e40f76e0/bin Fibonacci 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入n值：
15
递归法执行次数：986次
递归法执行时间：0.0ms
动态规划法执行次数：14次
动态规划法执行时间：0.0ms
```

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/5c2e7e2d/redhat.java/jdt_ws/homework_template_e40f76e0/bin Fibonacci 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入n值：
20
递归法执行次数：10945次
递归法执行时间：1.0ms
动态规划法执行次数：19次
动态规划法执行时间：0.0ms
```

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/5c2e7e2d/redhat.java/jdt_ws/homework_template_e40f76e0/bin Fibonacci 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入n值：
25
递归法执行次数：121392次
递归法执行时间：1.0ms
动态规划法执行次数：24次
动态规划法执行时间：0.0ms
```

```
gitpod /workspace/homework_template (main) $  cd /workspace/homework_template ; /usr/bin/env /home/gitpod/.sdkman/candidates/java/11.0.15.fx-zulu/bin/java -cp /workspace/.vscode-remote/data/User/workspaceStorage/5c2e7e2d/redhat.java/jdt_ws/homework_template_e40f76e0/bin Fibonacci 
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入n值：
30
递归法执行次数：1346268次
递归法执行时间：4.0ms
动态规划法执行次数：29次
动态规划法执行时间：0.0ms
```

![image-20220628090535234](C:\Users\86135\AppData\Roaming\Typora\typora-user-images\image-20220628090535234.png)

所以观察实验结果可知：分治算法的时间复杂度为指数阶O(2^n)而动态规划法为线性阶O(n)，由代码可知，分治法的代码简明易懂，动态规划法的较为复杂一点，然而结合图像可知当输入规模n小于20时两者比较次数较接近，但当n大于20时分治法的比较次数就远远超过了动态规划法，所以可见动态规划法的时间复杂度，基本操作执行次数都是要远远小于分治法的。