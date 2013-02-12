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
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayOutputStream	TokenNameIdentifier
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
PrintStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
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
BenchmarkTestCase	TokenNameIdentifier
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
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Config	TokenNameIdentifier
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
NoDeletionPolicy	TokenNameIdentifier
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
NoMergePolicy	TokenNameIdentifier
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
NoMergeScheduler	TokenNameIdentifier
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
Version	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CreateIndexTaskTest	TokenNameIdentifier
extends	TokenNameextends
BenchmarkTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
PerfRunData	TokenNameIdentifier
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
infoStreamValue	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"writer.version"	TokenNameStringLiteral
,	TokenNameCOMMA
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_31	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"print.props"	TokenNameStringLiteral
,	TokenNameCOMMA
"false"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"directory"	TokenNameStringLiteral
,	TokenNameCOMMA
"RAMDirectory"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
infoStreamValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"writer.info.stream"	TokenNameStringLiteral
,	TokenNameCOMMA
infoStreamValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Config	TokenNameIdentifier
config	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Config	TokenNameIdentifier
(	TokenNameLPAREN
props	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
PerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
config	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testInfoStream_SystemOutErr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PrintStream	TokenNameIdentifier
curOut	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
;	TokenNameSEMICOLON
ByteArrayOutputStream	TokenNameIdentifier
baos	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
setOut	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
baos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
=	TokenNameEQUAL
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
"SystemOut"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CreateIndexTask	TokenNameIdentifier
cit	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CreateIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cit	TokenNameIdentifier
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CloseIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
baos	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setOut	TokenNameIdentifier
(	TokenNameLPAREN
curOut	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
PrintStream	TokenNameIdentifier
curErr	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
;	TokenNameSEMICOLON
baos	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
baos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
=	TokenNameEQUAL
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
"SystemErr"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CreateIndexTask	TokenNameIdentifier
cit	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CreateIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cit	TokenNameIdentifier
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CloseIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
baos	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
curErr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testInfoStream_File	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
outFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getWorkDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"infoStreamTest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
=	TokenNameEQUAL
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
outFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CreateIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CloseIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
outFile	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
=	TokenNameEQUAL
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runData	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
"merge.policy"	TokenNameStringLiteral
,	TokenNameCOMMA
NoMergePolicy	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CreateIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CloseIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
=	TokenNameEQUAL
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runData	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
"merge.scheduler"	TokenNameStringLiteral
,	TokenNameCOMMA
NoMergeScheduler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CreateIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CloseIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoDeletionPolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
=	TokenNameEQUAL
createPerfRunData	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runData	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
"deletion.policy"	TokenNameStringLiteral
,	TokenNameCOMMA
NoDeletionPolicy	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CreateIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
CloseIndexTask	TokenNameIdentifier
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE