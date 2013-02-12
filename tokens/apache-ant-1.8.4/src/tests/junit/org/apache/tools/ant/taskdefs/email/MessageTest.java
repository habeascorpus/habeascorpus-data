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
email	TokenNameIdentifier
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
FileOutputStream	TokenNameIdentifier
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
PrintStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MessageTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.io.tmpdir"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"message.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testPrintStreamDoesNotGetClosed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Message	TokenNameIdentifier
ms	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Message	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Project	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ms	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ms	TokenNameIdentifier
.	TokenNameDOT
addText	TokenNameIdentifier
(	TokenNameLPAREN
"hi, this is an email"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileOutputStream	TokenNameIdentifier
fis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
fis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ms	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
fis	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fis	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
120	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
"we should not have issues writing after having called Message.print"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
fis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
fu	TokenNameIdentifier
=	TokenNameEQUAL
FileUtils	TokenNameIdentifier
.	TokenNameDOT
getFileUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fu	TokenNameIdentifier
.	TokenNameDOT
tryHardToDelete	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE