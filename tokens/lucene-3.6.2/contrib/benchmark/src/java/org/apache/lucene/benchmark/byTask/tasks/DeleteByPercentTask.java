package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
tasks	TokenNameIdentifier
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
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
PerfRunData	TokenNameIdentifier
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
TermDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DeleteByPercentTask	TokenNameIdentifier
extends	TokenNameextends
PerfTask	TokenNameIdentifier
{	TokenNameLBRACE
double	TokenNamedouble
percent	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numDeleted	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
Random	TokenNameIdentifier
random	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DeleteByPercentTask	TokenNameIdentifier
(	TokenNameLPAREN
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
random	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Random	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"delete.percent.rand.seed"	TokenNameStringLiteral
,	TokenNameCOMMA
1717	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setParams	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setParams	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
percent	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
parseDouble	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
supportsParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
getRunData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxDoc	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
numDeleted	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
numToDelete	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
maxDoc	TokenNameIdentifier
*	TokenNameMULTIPLY
percent	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
r	TokenNameIdentifier
.	TokenNameDOT
numDeletedDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numToDelete	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
.	TokenNameDOT
undeleteAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numToDelete	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
maxDoc	TokenNameIdentifier
*	TokenNameMULTIPLY
percent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
numDeleted	TokenNameIdentifier
<	TokenNameLESS
numToDelete	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
delRate	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
(	TokenNameLPAREN
numToDelete	TokenNameIdentifier
-	TokenNameMINUS
numDeleted	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
r	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermDocs	TokenNameIdentifier
termDocs	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
termDocs	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
termDocs	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
numDeleted	TokenNameIdentifier
<	TokenNameLESS
numToDelete	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextDouble	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
delRate	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
.	TokenNameDOT
deleteDocument	TokenNameIdentifier
(	TokenNameLPAREN
termDocs	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numDeleted	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
termDocs	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"--> processed (delete) "	TokenNameStringLiteral
+	TokenNamePLUS
numDeleted	TokenNameIdentifier
+	TokenNamePLUS
" docs"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
decRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
numDeleted	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
