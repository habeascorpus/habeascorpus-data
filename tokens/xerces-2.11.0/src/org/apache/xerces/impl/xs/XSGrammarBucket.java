package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XSGrammarBucket	TokenNameIdentifier
{	TokenNameLBRACE
Hashtable	TokenNameIdentifier
fGrammarRegistry	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SchemaGrammar	TokenNameIdentifier
fNoNSGrammar	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
SchemaGrammar	TokenNameIdentifier
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
namespace	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
fNoNSGrammar	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
fGrammarRegistry	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
grammar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
getTargetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
fNoNSGrammar	TokenNameIdentifier
=	TokenNameEQUAL
grammar	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
fGrammarRegistry	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
getTargetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
grammar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
grammar	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
deep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SchemaGrammar	TokenNameIdentifier
sg	TokenNameIdentifier
=	TokenNameEQUAL
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
fTargetNamespace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sg	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
sg	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
grammar	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
deep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Vector	TokenNameIdentifier
currGrammars	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Vector	TokenNameIdentifier
)	TokenNameRPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
getImportedGrammars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currGrammars	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Vector	TokenNameIdentifier
grammars	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Vector	TokenNameIdentifier
)	TokenNameRPAREN
currGrammars	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SchemaGrammar	TokenNameIdentifier
sg1	TokenNameIdentifier
,	TokenNameCOMMA
sg2	TokenNameIdentifier
;	TokenNameSEMICOLON
Vector	TokenNameIdentifier
gs	TokenNameIdentifier
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
grammars	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sg1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
grammars	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sg2	TokenNameIdentifier
=	TokenNameEQUAL
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
sg1	TokenNameIdentifier
.	TokenNameDOT
fTargetNamespace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sg2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
gs	TokenNameIdentifier
=	TokenNameEQUAL
sg1	TokenNameIdentifier
.	TokenNameDOT
getImportedGrammars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gs	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
gs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sg2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
gs	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
grammars	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
sg2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
grammars	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
sg2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
sg2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
sg1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
grammars	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
grammars	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
grammar	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
deep	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
ignoreConflict	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
ignoreConflict	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
,	TokenNameCOMMA
deep	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SchemaGrammar	TokenNameIdentifier
sg	TokenNameIdentifier
=	TokenNameEQUAL
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
fTargetNamespace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sg	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
deep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Vector	TokenNameIdentifier
currGrammars	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Vector	TokenNameIdentifier
)	TokenNameRPAREN
grammar	TokenNameIdentifier
.	TokenNameDOT
getImportedGrammars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currGrammars	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Vector	TokenNameIdentifier
grammars	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Vector	TokenNameIdentifier
)	TokenNameRPAREN
currGrammars	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SchemaGrammar	TokenNameIdentifier
sg1	TokenNameIdentifier
,	TokenNameCOMMA
sg2	TokenNameIdentifier
;	TokenNameSEMICOLON
Vector	TokenNameIdentifier
gs	TokenNameIdentifier
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
grammars	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sg1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
grammars	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sg2	TokenNameIdentifier
=	TokenNameEQUAL
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
sg1	TokenNameIdentifier
.	TokenNameDOT
fTargetNamespace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sg2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
gs	TokenNameIdentifier
=	TokenNameEQUAL
sg1	TokenNameIdentifier
.	TokenNameDOT
getImportedGrammars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gs	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
gs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sg2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
gs	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
grammars	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
sg2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
grammars	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
sg2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
grammars	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
sg1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
grammars	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
grammars	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SchemaGrammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getGrammars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
fGrammarRegistry	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
fNoNSGrammar	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SchemaGrammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
grammars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SchemaGrammar	TokenNameIdentifier
[	TokenNameLBRACKET
count	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
schemas	TokenNameIdentifier
=	TokenNameEQUAL
fGrammarRegistry	TokenNameIdentifier
.	TokenNameDOT
elements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
schemas	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
grammars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
SchemaGrammar	TokenNameIdentifier
)	TokenNameRPAREN
schemas	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fNoNSGrammar	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
grammars	TokenNameIdentifier
[	TokenNameLBRACKET
count	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
fNoNSGrammar	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
grammars	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fNoNSGrammar	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fGrammarRegistry	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
