package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NOnesIntDecoder	TokenNameIdentifier
extends	TokenNameextends
FourFlagsIntDecoder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
n	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
onesCounter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NOnesIntDecoder	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
n	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
decode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
onesCounter	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
--	TokenNameMINUS_MINUS
onesCounter	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
long	TokenNamelong
decode	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
decode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
decode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
decode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
onesCounter	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
decode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
decode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
EOS	TokenNameIdentifier
?	TokenNameQUESTION
EOS	TokenNameIdentifier
:	TokenNameCOLON
decode	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reInit	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
reInit	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
onesCounter	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"NOnes ("	TokenNameStringLiteral
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
") ("	TokenNameStringLiteral
+	TokenNamePLUS
super	TokenNamesuper
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
