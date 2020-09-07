---
layout: default
title: Resources
---

This page contains links to useful resources.

Development Environment
------------------------------------
- Microsoft  [Visual Studio](https://visualstudio.microsoft.com/) is an integrated development environment from Microsoft. It is used to develop computer programs, as well as websites, web apps, web services and mobile apps.
- [GCC](https://gcc.gnu.org/), the GNU Compiler Collection.
- [GDB](https://www.gnu.org/software/gdb/), the GNU Project Debugger.
-  [Apache NetBeans](ttps://netbeans.org/) Quickly and easily develop desktop, mobile, and web applications
with Java, JavaScript, HTML5, PHP, C/C++ and more.

Passive Capture
------------------------------------
- [Wireshark](https://www.wireshark.org/) is the most popular tool for passive packet capture and analysis.
- [Microsoft Message Analyzer](https://docs.microsoft.com/en-us/message-analyzer/microsoft-message-analyzer-operating-guide) is an extensible tool for analyzing network.
traffic on Windows. *Retired on November 25, 2019.*
- [TCPDump & libpcap](http://www.tcpdump.org/) is a powerful command-line packet analyzer; and libpcap, a portable C/C++ library for network traffic capture, and it's windows implementation [WinPcap](https://www.winpcap.org/).
- [netwox](http://www.cis.syr.edu/~wedu/Teaching/cis758/netw522/netwox-doc_html/) is a **netw**ork toolb**ox** is a nwtwork _toolbox_ for network administrators and network hackers.
- [netwib](http://www.cis.syr.edu/~wedu/seed/Labs/Lab_Setup/netw522/) is a <b>netw</b>ork l<b>ib</b>rary is a network _library_, for network administrators and network hackers.
  - netwox already contains several tools using the netwib network library.
- [netwag](http://www.cis.syr.edu/~wedu/seed/Labs/Lab_Setup/netw522/netwag-doc_html/) is a graphical front end for netwox.
  - netwox & netwag [Troubleshooting guide](docs\netwox.pdf)

Active Capture
------------------------------------
- The [Canape tool](https://github.com/ctxis/canape) as a generic network protocol man-in-the-middle testing, analyzing, and exploitation tool with a usable GUI.

Network Connectivity
------------------------------------
- The [Hping](http://www.hping.org/) tool is similar to the traditional ping utility, but it supports more than just ICMP echo requests.
- [Netcat](http://netcat.sourceforge.net/) is a command line tool that connects to an arbitrary TCP or UDP port and allows you to send and receive data.
  - Netcat cheat sheet [pocket reference guide](docs/netcat_cheat_sheet_v1.pdf)
- If you need to scan the open network interface on a remote system, nothing is better than [Nmap](https://nmap.org/).
- _netdiscover_ is a network address discovering tool, install by using `sudo apt-get install netdiscover`.

Network Spoofing
------------------------------------
- [Ettercap](https://www.ettercap-project.org/) is a man-in-the-middle tool designed to
listen to network traffic between two devices.

System Utilities
------------------------------------
- [Sysinternals Suite](https://docs.microsoft.com/en-us/sysinternals/) is a suite of more than 70 freeware utilities used to monitor, manage and troubleshoot the Windows operating system.

API Development
------------------------------------
- [Postman](https://www.getpostman.com/]) API development environment.
- [Fiddler](https://www.telerik.com/fiddler) is free web debugging proxy for any browser, system or platform.
- [A RESTful Tutorial](https://www.restapitutorial.com/).


Supplemental Material
------------------------------------
-  [Interactive Exercises](http://gaia.cs.umass.edu/kurose_ross/interactive/)
-  [High Performance Browser Networking](https://hpbn.co/) is what every web developer should know about networking and web performance.
-  [Eloquent JavaScript](https://eloquentjavascript.net/) is a book about JavaScript, programming, and the wonders of the digital.

Bounty Platform
-----------------------------------
- [HackerOne](https://www.hackerone.com/) is a vulnerability coordination and bug bounty platform that connects businesses with cybersecurity researchers.
- [Bugcrowd](https://www.bugcrowd.com/) is a crowdsourced security platform; managing organizations bug bounty, vulnerability disclosure, and next-gen pen test programs.

References
-----------------------------------

- [Root Servers Map](https://root-servers.org/)
- [IANA](https://www.iana.org/) - Internet Assigned Numbers Authority
- [Service Name and Transport Protocol Port Number Registry](https://www.iana.org/assignments/service-names-port-numbers/service-names-port-numbers.xhtml)
- CERN 2019 [WorldWideWeb](https://worldwideweb.cern.ch/browser/) Rebuild
- [The CERT Division](https://www.sei.cmu.edu/about/divisions/cert/index.cfm) at Carnegie Mellon University
- [Assigned Internet Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
- [IEEE 802.3](http://www.ieee802.org/3/) - ETHERNET WORKING GROUP

Technical Documentation
-----------------------------------
#### HTTP
  - [RFC 7230](https://tools.ietf.org/html/rfc7230), HTTP/1.1: Message Syntax and Routing
  - [RFC 7231](https://tools.ietf.org/html/rfc7231), HTTP/1.1: Semantics and Content
  - [RFC 7232](https://tools.ietf.org/html/rfc7232), HTTP/1.1: Conditional Requests
  - [RFC 7233](https://tools.ietf.org/html/rfc7233), HTTP/1.1: Range Requests
  - [RFC 7234](https://tools.ietf.org/html/rfc7234), HTTP/1.1: Caching
  - [RFC 7235](https://tools.ietf.org/html/rfc7235), HTTP/1.1: Authentication
  - [RFC 7540](https://tools.ietf.org/html/rfc7540), HTTP/2
  - [draft-ietf-quic-http](https://tools.ietf.org/html/draft-ietf-quic-http-23), HTTP/3

#### SMTP
  - [RFC 2821](https://tools.ietf.org/html/rfc2821), Simple Mail Transfer Protocol
  - [RFC 2920](https://tools.ietf.org/html/rfc2920), SMTP Service Extension for Command Pipelining (STD 60)
  - [RFC 3030](https://tools.ietf.org/html/rfc3030), SMTP Service Extensions for Transmission of Large and Binary MIME Messages
  - [RFC 3207](https://tools.ietf.org/html/rfc3207), SMTP Service Extension for Secure SMTP over Transport Layer Security
  - [RFC 3461](https://tools.ietf.org/html/rfc3461), SMTP Service Extension for Delivery Status Notifications
