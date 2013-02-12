package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
Charset	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
UnsupportedCharsetException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
class	TokenNameclass
ZipEncodingHelper	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
SimpleEncodingHolder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
highChars	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Simple8BitZipEncoding	TokenNameIdentifier
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
SimpleEncodingHolder	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
highChars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
highChars	TokenNameIdentifier
=	TokenNameEQUAL
highChars	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
Simple8BitZipEncoding	TokenNameIdentifier
getEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Simple8BitZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
highChars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Map	TokenNameIdentifier
simpleEncodings	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
simpleEncodings	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cp437_high_chars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0x00c7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ea	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00eb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ef	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ee	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ec	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ff	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00dc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x20a7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x0192	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ed	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fa	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00aa	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ba	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bf	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2310	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ac	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bd	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ab	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2591	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2592	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2593	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2502	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2524	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2561	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2562	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2556	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2555	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2563	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2551	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2557	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255d	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255b	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2510	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2514	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2534	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x252c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x251c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2500	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x253c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255e	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255f	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255a	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2554	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2569	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2566	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2560	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2550	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x256c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2567	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2568	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2564	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2565	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2559	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2558	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2552	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2553	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x256b	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x256a	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2518	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x250c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2588	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2584	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x258c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2590	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2580	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03b1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00df	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x0393	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03c0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03a3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03c3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03c4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03a6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x0398	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03a9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03b4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x221e	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03c6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x03b5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2229	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2261	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2265	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2264	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2320	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2321	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2248	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2219	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x221a	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x207f	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x25a0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
SimpleEncodingHolder	TokenNameIdentifier
cp437	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleEncodingHolder	TokenNameIdentifier
(	TokenNameLPAREN
cp437_high_chars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"CP437"	TokenNameStringLiteral
,	TokenNameCOMMA
cp437	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"Cp437"	TokenNameStringLiteral
,	TokenNameCOMMA
cp437	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"cp437"	TokenNameStringLiteral
,	TokenNameCOMMA
cp437	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"IBM437"	TokenNameStringLiteral
,	TokenNameCOMMA
cp437	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"ibm437"	TokenNameStringLiteral
,	TokenNameCOMMA
cp437	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cp850_high_chars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0x00c7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ea	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00eb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ef	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ee	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ec	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ff	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00dc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x0192	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ed	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fa	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00aa	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ba	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bf	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ae	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ac	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bd	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ab	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00bb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2591	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2592	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2593	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2502	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2524	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2563	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2551	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2557	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255d	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2510	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2514	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2534	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x252c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x251c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2500	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x253c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00e3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x255a	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2554	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2569	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2566	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2560	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2550	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x256c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ca	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00cb	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00c8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x0131	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00cd	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ce	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00cf	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2518	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x250c	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2588	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2584	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00cc	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2580	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00df	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b5	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fe	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00de	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00da	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00db	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00d9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00fd	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00dd	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00af	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ad	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2017	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00be	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b6	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00f7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b7	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b3	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00b2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x25a0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00a0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
SimpleEncodingHolder	TokenNameIdentifier
cp850	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleEncodingHolder	TokenNameIdentifier
(	TokenNameLPAREN
cp850_high_chars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"CP850"	TokenNameStringLiteral
,	TokenNameCOMMA
cp850	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"Cp850"	TokenNameStringLiteral
,	TokenNameCOMMA
cp850	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"cp850"	TokenNameStringLiteral
,	TokenNameCOMMA
cp850	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"IBM850"	TokenNameStringLiteral
,	TokenNameCOMMA
cp850	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"ibm850"	TokenNameStringLiteral
,	TokenNameCOMMA
cp850	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
ByteBuffer	TokenNameIdentifier
growBuffer	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
b	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
newCapacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
b	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b	TokenNameIdentifier
.	TokenNameDOT
rewind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
c2	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
capacity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
on	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
allocate	TokenNameIdentifier
(	TokenNameLPAREN
c2	TokenNameIdentifier
<	TokenNameLESS
newCapacity	TokenNameIdentifier
?	TokenNameQUESTION
newCapacity	TokenNameIdentifier
:	TokenNameCOLON
c2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
on	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
on	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
HEX_DIGITS	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0x30	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x31	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x32	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x33	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x34	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x35	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x36	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x37	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x38	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x39	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x41	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x42	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x43	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x44	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x45	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x46	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
static	TokenNamestatic
void	TokenNamevoid
appendSurrogate	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bb	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bb	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
'%'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bb	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
'U'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bb	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
HEX_DIGITS	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
c	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
12	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x0f	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bb	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
HEX_DIGITS	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
c	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x0f	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bb	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
HEX_DIGITS	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
c	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x0f	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bb	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
HEX_DIGITS	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
&	TokenNameAND
0x0f	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
UTF8	TokenNameIdentifier
=	TokenNameEQUAL
"UTF8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
UTF_DASH_8	TokenNameIdentifier
=	TokenNameEQUAL
"utf-8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
ZipEncoding	TokenNameIdentifier
UTF8_ZIP_ENCODING	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FallbackZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
UTF8	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
ZipEncoding	TokenNameIdentifier
getZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isUTF8	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
UTF8_ZIP_ENCODING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FallbackZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SimpleEncodingHolder	TokenNameIdentifier
h	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SimpleEncodingHolder	TokenNameIdentifier
)	TokenNameRPAREN
simpleEncodings	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
h	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
h	TokenNameIdentifier
.	TokenNameDOT
getEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
Charset	TokenNameIdentifier
cs	TokenNameIdentifier
=	TokenNameEQUAL
Charset	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
NioZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
cs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedCharsetException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FallbackZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
boolean	TokenNameboolean
isUTF8	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
encoding	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
encoding	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"file.encoding"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
UTF8	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
UTF_DASH_8	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
