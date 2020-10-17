---
layout: default
course_number: CS330
title: "Homework: Chapter 1"
---

## Chapter 1 Homework

### R13.
Suppose users share a <i>2 Mbps</i> link. Also suppose each user transmits continuously at <i>1 Mbps</i> when transmitting, but each user transmits only <i>20</i> percent of the time. (See the discussion of statistical multiplexing in Section 1.3.)
  - When circuit switching is used, how many users can be supported?
  - For the remainder of this problem, suppose packet switching is used. Why will there be essentially no queuing delay before the link if two or fewer users transmit at the same time? Why will there be a queuing delay if three users transmit at the same time?
  - Find the probability that a given user is transmitting.
  - Suppose now there are three users. Find the probability that at any given time, all three
users are transmitting simultaneously. Find the fraction of time during which the queue grows.

### R16.
Consider sending a packet from a source host to a destination host over a fixed route. List the delay components in the <b>end-to-end</b> delay. Which of these delays are constant and which are variable?

### R19.
Suppose Host A wants to send a large file to Host B. The path from Host A to Host B has
three links, of rates <i>R1</i> = <i>500 kbps</i>, <i>R2</i> = <i>2 Mbps</i>, and <i>R3</i> = <i>1 Mbps</i>.
- Assuming no other traffic in the network, what is the throughput for the file transfer?
- Suppose the file is <i>4 million bytes</i>. Dividing the file size by the throughput, roughly how long will it take to transfer the file to Host B?
- Repeat (a) and (b), but now with <i>R</i> reduced to <i>100 kbps</i>.

### P6.
This elementary problem begins to explore propagation delay and transmission delay, two central concepts in data networking. Consider two hosts, A and B, connected by a single link of rate <i>R</i> bps. Suppose that the two hosts are separated by <i>m</i> meters, and suppose the propagation speed along the link is <i>s</i> meters/sec. Host A is to send a packet of size <i>L</i> bits to Host B.
  - Express the propagation delay, <i>d<sub>prop</sub></i>, in terms of <i>m</i> and <i>s</i>.
  - Determine the transmission time of the packet, <i>d<sub>trans</sub></i>, in terms of <i>L</i> and <i>R</i>.
  - Ignoring processing and queuing delays, obtain an expression for the end-to-end delay.
  - Suppose Host A begins to transmit the packet at time _t_ = 0. At time _t = d<sub>trans</sub>_, where is the last bit of the packet?
  - Suppose _d<sub>prop</sub>_ is greater than _d<sub>trans</sub>_. At time *t = d<sub>trans</sub>*, where is the first bit of the packet?
  - Suppose _d<sub>prop</sub>_ is less than _d<sub>trans</sub>_. At time _t = d<sub>trans</sub>_, where is the first bit of the packet?
  - Suppose *s* = 2.5 · 10<sup>8</sup>, *L* = 120 bits, and *R* = 56 kbps. Find the distance *m* so that _d<sub>prop</sub>_ equals _d<sub>trans</sub>_.


### Submit

Post your solutions in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
