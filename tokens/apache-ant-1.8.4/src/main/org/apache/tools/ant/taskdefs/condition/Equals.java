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
condition	TokenNameIdentifier
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
Equals	TokenNameIdentifier
implements	TokenNameimplements
Condition	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
REQUIRED	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
|	TokenNameOR
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Object	TokenNameIdentifier
arg1	TokenNameIdentifier
,	TokenNameCOMMA
arg2	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
trim	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
caseSensitive	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
args	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
forcestring	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setArg1	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
arg1	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setArg1	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
setArg1Internal	TokenNameIdentifier
(	TokenNameLPAREN
arg1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setArg1	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
a1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setArg1Internal	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setArg1Internal	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
arg1	TokenNameIdentifier
=	TokenNameEQUAL
arg1	TokenNameIdentifier
;	TokenNameSEMICOLON
args	TokenNameIdentifier
|=	TokenNameOR_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setArg2	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
arg2	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setArg2	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
setArg2Internal	TokenNameIdentifier
(	TokenNameLPAREN
arg2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setArg2	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
a2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setArg2Internal	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setArg2Internal	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
arg2	TokenNameIdentifier
=	TokenNameEQUAL
arg2	TokenNameIdentifier
;	TokenNameSEMICOLON
args	TokenNameIdentifier
|=	TokenNameOR_EQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTrim	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
trim	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCasesensitive	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
caseSensitive	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setForcestring	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
forcestring	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
forcestring	TokenNameIdentifier
=	TokenNameEQUAL
forcestring	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
eval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
args	TokenNameIdentifier
&	TokenNameAND
REQUIRED	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
REQUIRED	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"both arg1 and arg2 are required in equals"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
arg1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
arg2	TokenNameIdentifier
||	TokenNameOR_OR
arg1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
arg1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
arg2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
forcestring	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
arg1	TokenNameIdentifier
=	TokenNameEQUAL
arg1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
arg1	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
?	TokenNameQUESTION
arg1	TokenNameIdentifier
:	TokenNameCOLON
arg1	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
arg2	TokenNameIdentifier
=	TokenNameEQUAL
arg2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
arg2	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
?	TokenNameQUESTION
arg2	TokenNameIdentifier
:	TokenNameCOLON
arg2	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
arg1	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
&&	TokenNameAND_AND
trim	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
arg1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg1	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
arg2	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
&&	TokenNameAND_AND
trim	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
arg2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg2	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
arg1	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
&&	TokenNameAND_AND
arg2	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg1	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg2	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
caseSensitive	TokenNameIdentifier
?	TokenNameQUESTION
s1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s2	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
s1	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
s2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE