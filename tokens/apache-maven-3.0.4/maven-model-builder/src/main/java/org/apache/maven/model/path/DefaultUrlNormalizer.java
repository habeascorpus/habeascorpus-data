package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
path	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
Component	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
UrlNormalizer	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultUrlNormalizer	TokenNameIdentifier
implements	TokenNameimplements
UrlNormalizer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
normalize	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
url	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
url	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"/../"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
idx	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
parent	TokenNameIdentifier
=	TokenNameEQUAL
idx	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
parent	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
result	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
parent	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
parent	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
'/'	TokenNameCharacterLiteral
,	TokenNameCOMMA
parent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
parent	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
parent	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
result	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE