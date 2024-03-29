package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
quality	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
Term	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
TermEnum	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
Directory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
FSDirectory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
PriorityQueue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
QualityQueriesFinder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
newline	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
QualityQueriesFinder	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
dir	TokenNameIdentifier
=	TokenNameEQUAL
dir	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Usage: java QualityQueriesFinder <index-dir>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
QualityQueriesFinder	TokenNameIdentifier
qqf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QualityQueriesFinder	TokenNameIdentifier
(	TokenNameLPAREN
FSDirectory	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
q	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
qqf	TokenNameIdentifier
.	TokenNameDOT
bestQueries	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
q	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
newline	TokenNameIdentifier
+	TokenNamePLUS
formatQueryAsTrecTopic	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bestQueries	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numQueries	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
words	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
bestTerms	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
numQueries	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
words	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
m	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
/	TokenNameDIVIDE
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
res	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
m	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
res	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
words	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
words	TokenNameIdentifier
[	TokenNameLBRACKET
m	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
"  "	TokenNameStringLiteral
+	TokenNamePLUS
words	TokenNameIdentifier
[	TokenNameLBRACKET
n	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
-	TokenNameMINUS
m	TokenNameIdentifier
-	TokenNameMINUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
words	TokenNameIdentifier
[	TokenNameLBRACKET
n	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
-	TokenNameMINUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
formatQueryAsTrecTopic	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
qnum	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
title	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
description	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
narrative	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"<top>"	TokenNameStringLiteral
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
"<num> Number: "	TokenNameStringLiteral
+	TokenNamePLUS
qnum	TokenNameIdentifier
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
"<title> "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
title	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
title	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
"<desc> Description:"	TokenNameStringLiteral
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
description	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
description	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
"<narr> Narrative:"	TokenNameStringLiteral
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
narrative	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
narrative	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
newline	TokenNameIdentifier
+	TokenNamePLUS
"</top>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bestTerms	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numTerms	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
PriorityQueue	TokenNameIdentifier
<	TokenNameLESS
TermDf	TokenNameIdentifier
>	TokenNameGREATER
pq	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermsDfQueue	TokenNameIdentifier
(	TokenNameLPAREN
numTerms	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
ir	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
threshold	TokenNameIdentifier
=	TokenNameEQUAL
ir	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
TermEnum	TokenNameIdentifier
terms	TokenNameIdentifier
=	TokenNameEQUAL
ir	TokenNameIdentifier
.	TokenNameDOT
terms	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
terms	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
field	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
field	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
df	TokenNameIdentifier
=	TokenNameEQUAL
terms	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
df	TokenNameIdentifier
<	TokenNameLESS
threshold	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
ttxt	TokenNameIdentifier
=	TokenNameEQUAL
terms	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
text	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq	TokenNameIdentifier
.	TokenNameDOT
insertWithOverflow	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermDf	TokenNameIdentifier
(	TokenNameLPAREN
ttxt	TokenNameIdentifier
,	TokenNameCOMMA
df	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
ir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
res	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
pq	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pq	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
TermDf	TokenNameIdentifier
tdf	TokenNameIdentifier
=	TokenNameEQUAL
pq	TokenNameIdentifier
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
tdf	TokenNameIdentifier
.	TokenNameDOT
word	TokenNameIdentifier
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
".   word:  "	TokenNameStringLiteral
+	TokenNamePLUS
tdf	TokenNameIdentifier
.	TokenNameDOT
df	TokenNameIdentifier
+	TokenNamePLUS
"   "	TokenNameStringLiteral
+	TokenNamePLUS
tdf	TokenNameIdentifier
.	TokenNameDOT
word	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
TermDf	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
word	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
df	TokenNameIdentifier
;	TokenNameSEMICOLON
TermDf	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
word	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
freq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
word	TokenNameIdentifier
=	TokenNameEQUAL
word	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
df	TokenNameIdentifier
=	TokenNameEQUAL
freq	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
TermsDfQueue	TokenNameIdentifier
extends	TokenNameextends
PriorityQueue	TokenNameIdentifier
<	TokenNameLESS
TermDf	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
TermsDfQueue	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
initialize	TokenNameIdentifier
(	TokenNameLPAREN
maxSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
lessThan	TokenNameIdentifier
(	TokenNameLPAREN
TermDf	TokenNameIdentifier
tf1	TokenNameIdentifier
,	TokenNameCOMMA
TermDf	TokenNameIdentifier
tf2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tf1	TokenNameIdentifier
.	TokenNameDOT
df	TokenNameIdentifier
<	TokenNameLESS
tf2	TokenNameIdentifier
.	TokenNameDOT
df	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
