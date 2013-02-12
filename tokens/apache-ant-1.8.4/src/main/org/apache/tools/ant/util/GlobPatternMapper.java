package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
GlobPatternMapper	TokenNameIdentifier
implements	TokenNameimplements
FileNameMapper	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
fromPrefix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
fromPostfix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
prefixLength	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
postfixLength	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
toPrefix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
toPostfix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
fromContainsStar	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
toContainsStar	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
handleDirSep	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
caseSensitive	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setHandleDirSep	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
handleDirSep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
handleDirSep	TokenNameIdentifier
=	TokenNameEQUAL
handleDirSep	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getHandleDirSep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
handleDirSep	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCaseSensitive	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
caseSensitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
caseSensitive	TokenNameIdentifier
=	TokenNameEQUAL
caseSensitive	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFrom	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
from	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
from	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
from	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
"*"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fromPrefix	TokenNameIdentifier
=	TokenNameEQUAL
from	TokenNameIdentifier
;	TokenNameSEMICOLON
fromPostfix	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
fromPrefix	TokenNameIdentifier
=	TokenNameEQUAL
from	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fromPostfix	TokenNameIdentifier
=	TokenNameEQUAL
from	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fromContainsStar	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prefixLength	TokenNameIdentifier
=	TokenNameEQUAL
fromPrefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
postfixLength	TokenNameIdentifier
=	TokenNameEQUAL
fromPostfix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"this mapper requires a 'from' attribute"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTo	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
to	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
"*"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
toPrefix	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
;	TokenNameSEMICOLON
toPostfix	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
toPrefix	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
toPostfix	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
toContainsStar	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"this mapper requires a 'to' attribute"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sourceFileName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
modName	TokenNameIdentifier
=	TokenNameEQUAL
modifyName	TokenNameIdentifier
(	TokenNameLPAREN
sourceFileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fromPrefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
(	TokenNameLPAREN
sourceFileName	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
(	TokenNameLPAREN
prefixLength	TokenNameIdentifier
+	TokenNamePLUS
postfixLength	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
!	TokenNameNOT
fromContainsStar	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
modName	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
modifyName	TokenNameIdentifier
(	TokenNameLPAREN
fromPrefix	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
fromContainsStar	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
modName	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
modifyName	TokenNameIdentifier
(	TokenNameLPAREN
fromPrefix	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
!	TokenNameNOT
modName	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
modifyName	TokenNameIdentifier
(	TokenNameLPAREN
fromPostfix	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
toPrefix	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
toContainsStar	TokenNameIdentifier
?	TokenNameQUESTION
extractVariablePart	TokenNameIdentifier
(	TokenNameLPAREN
sourceFileName	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
toPostfix	TokenNameIdentifier
:	TokenNameCOLON
""	TokenNameStringLiteral
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
extractVariablePart	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
name	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
prefixLength	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
postfixLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
modifyName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
caseSensitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
name	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
handleDirSep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
name	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
