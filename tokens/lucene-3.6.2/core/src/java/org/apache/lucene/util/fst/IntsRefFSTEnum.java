package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
fst	TokenNameIdentifier
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
ArrayUtil	TokenNameIdentifier
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
IntsRef	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
IntsRefFSTEnum	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
extends	TokenNameextends
FSTEnum	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
IntsRef	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IntsRef	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
IntsRef	TokenNameIdentifier
target	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
IntsRef	TokenNameIdentifier
input	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
T	TokenNameIdentifier
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IntsRefFSTEnum	TokenNameIdentifier
(	TokenNameLPAREN
FST	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
fst	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
fst	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
input	TokenNameIdentifier
=	TokenNameEQUAL
current	TokenNameIdentifier
;	TokenNameSEMICOLON
current	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
doNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
setResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
seekCeil	TokenNameIdentifier
(	TokenNameLPAREN
IntsRef	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
target	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
;	TokenNameSEMICOLON
targetLength	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
doSeekCeil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
setResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
seekFloor	TokenNameIdentifier
(	TokenNameLPAREN
IntsRef	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
target	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
;	TokenNameSEMICOLON
targetLength	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
doSeekFloor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
setResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
seekExact	TokenNameIdentifier
(	TokenNameLPAREN
IntsRef	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
target	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
;	TokenNameSEMICOLON
targetLength	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
super	TokenNamesuper
.	TokenNameDOT
doSeekExact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
upto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
+	TokenNamePLUS
target	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
setResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
int	TokenNameint
getTargetLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
upto	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
target	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
FST	TokenNameIdentifier
.	TokenNameDOT
END_LABEL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
target	TokenNameIdentifier
.	TokenNameDOT
ints	TokenNameIdentifier
[	TokenNameLBRACKET
target	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
upto	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
int	TokenNameint
getCurrentLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
current	TokenNameIdentifier
.	TokenNameDOT
ints	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
setCurrentLabel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
label	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
.	TokenNameDOT
ints	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
grow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
.	TokenNameDOT
ints	TokenNameIdentifier
=	TokenNameEQUAL
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
current	TokenNameIdentifier
.	TokenNameDOT
ints	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
InputOutput	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
setResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
upto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
current	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
upto	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
output	TokenNameIdentifier
=	TokenNameEQUAL
output	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE