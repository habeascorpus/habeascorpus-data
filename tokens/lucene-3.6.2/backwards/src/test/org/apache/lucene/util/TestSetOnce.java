package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
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
SetOnce	TokenNameIdentifier
.	TokenNameDOT
AlreadySetException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestSetOnce	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
SetOnceThread	TokenNameIdentifier
extends	TokenNameextends
Thread	TokenNameIdentifier
{	TokenNameLBRACE
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
set	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
final	TokenNamefinal
Random	TokenNameIdentifier
RAND	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SetOnceThread	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
RAND	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Random	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
sleep	TokenNameIdentifier
(	TokenNameLPAREN
RAND	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
set	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
success	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RuntimeException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testEmptyCtor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
set	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
set	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
=	TokenNameEQUAL
AlreadySetException	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
void	TokenNamevoid
testSettingCtor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
set	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
set	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
set	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
=	TokenNameEQUAL
AlreadySetException	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
void	TokenNamevoid
testSetOnce	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
set	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
set	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
set	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
set	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testSetMultiThreaded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
set	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SetOnce	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SetOnceThread	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
threads	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SetOnceThread	TokenNameIdentifier
[	TokenNameLBRACKET
10	TokenNameIntegerLiteral
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
threads	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
threads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
SetOnceThread	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"t-"	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
set	TokenNameIdentifier
=	TokenNameEQUAL
set	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Thread	TokenNameIdentifier
t	TokenNameIdentifier
:	TokenNameCOLON
threads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
t	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Thread	TokenNameIdentifier
t	TokenNameIdentifier
:	TokenNameCOLON
threads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
t	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
SetOnceThread	TokenNameIdentifier
t	TokenNameIdentifier
:	TokenNameCOLON
threads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
.	TokenNameDOT
success	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
expectedVal	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"thread "	TokenNameStringLiteral
+	TokenNamePLUS
t	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
expectedVal	TokenNameIdentifier
,	TokenNameCOMMA
t	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE