package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
perforce	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SimpleP4OutputHandler	TokenNameIdentifier
extends	TokenNameextends
P4HandlerAdapter	TokenNameIdentifier
{	TokenNameLBRACE
P4Base	TokenNameIdentifier
parent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SimpleP4OutputHandler	TokenNameIdentifier
(	TokenNameLPAREN
P4Base	TokenNameIdentifier
parent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
parent	TokenNameIdentifier
=	TokenNameEQUAL
parent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
process	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/^exit/"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/^error:/"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/^Perforce client error:/"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/label in sync/"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/up-to-date/"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
parent	TokenNameIdentifier
.	TokenNameDOT
setInError	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
line	TokenNameIdentifier
=	TokenNameEQUAL
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
substitute	TokenNameIdentifier
(	TokenNameLPAREN
"s/^[^:]*: //"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/^info.*?:/"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
line	TokenNameIdentifier
=	TokenNameEQUAL
parent	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
substitute	TokenNameIdentifier
(	TokenNameLPAREN
"s/^[^:]*: //"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
parent	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
,	TokenNameCOMMA
parent	TokenNameIdentifier
.	TokenNameDOT
getInError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_ERR	TokenNameIdentifier
:	TokenNameCOLON
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
getInError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
parent	TokenNameIdentifier
.	TokenNameDOT
setErrorMessage	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
getErrorMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
line	TokenNameIdentifier
+	TokenNamePLUS
StringUtils	TokenNameIdentifier
.	TokenNameDOT
LINE_SEP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
