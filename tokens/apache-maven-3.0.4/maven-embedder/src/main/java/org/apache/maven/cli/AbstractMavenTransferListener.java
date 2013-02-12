package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
DecimalFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
DecimalFormatSymbols	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
transfer	TokenNameIdentifier
.	TokenNameDOT
AbstractTransferListener	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
transfer	TokenNameIdentifier
.	TokenNameDOT
TransferCancelledException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
transfer	TokenNameIdentifier
.	TokenNameDOT
TransferEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
transfer	TokenNameIdentifier
.	TokenNameDOT
TransferResource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractMavenTransferListener	TokenNameIdentifier
extends	TokenNameextends
AbstractTransferListener	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
PrintStream	TokenNameIdentifier
out	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AbstractMavenTransferListener	TokenNameIdentifier
(	TokenNameLPAREN
PrintStream	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
out	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
out	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
out	TokenNameIdentifier
:	TokenNameCOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
transferInitiated	TokenNameIdentifier
(	TokenNameLPAREN
TransferEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
event	TokenNameIdentifier
.	TokenNameDOT
getRequestType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
TransferEvent	TokenNameIdentifier
.	TokenNameDOT
RequestType	TokenNameIdentifier
.	TokenNameDOT
PUT	TokenNameIdentifier
?	TokenNameQUESTION
"Uploading"	TokenNameStringLiteral
:	TokenNameCOLON
"Downloading"	TokenNameStringLiteral
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
+	TokenNamePLUS
": "	TokenNameStringLiteral
+	TokenNamePLUS
event	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRepositoryUrl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
event	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getResourceName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
transferCorrupted	TokenNameIdentifier
(	TokenNameLPAREN
TransferEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransferCancelledException	TokenNameIdentifier
{	TokenNameLBRACE
TransferResource	TokenNameIdentifier
resource	TokenNameIdentifier
=	TokenNameEQUAL
event	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"[WARNING] "	TokenNameStringLiteral
+	TokenNamePLUS
event	TokenNameIdentifier
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" for "	TokenNameStringLiteral
+	TokenNamePLUS
resource	TokenNameIdentifier
.	TokenNameDOT
getRepositoryUrl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
resource	TokenNameIdentifier
.	TokenNameDOT
getResourceName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
transferSucceeded	TokenNameIdentifier
(	TokenNameLPAREN
TransferEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TransferResource	TokenNameIdentifier
resource	TokenNameIdentifier
=	TokenNameEQUAL
event	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
contentLength	TokenNameIdentifier
=	TokenNameEQUAL
event	TokenNameIdentifier
.	TokenNameDOT
getTransferredBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
contentLength	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
type	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
getRequestType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
TransferEvent	TokenNameIdentifier
.	TokenNameDOT
RequestType	TokenNameIdentifier
.	TokenNameDOT
PUT	TokenNameIdentifier
?	TokenNameQUESTION
"Uploaded"	TokenNameStringLiteral
:	TokenNameCOLON
"Downloaded"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
len	TokenNameIdentifier
=	TokenNameEQUAL
contentLength	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
1024	TokenNameIntegerLiteral
?	TokenNameQUESTION
toKB	TokenNameIdentifier
(	TokenNameLPAREN
contentLength	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" KB"	TokenNameStringLiteral
:	TokenNameCOLON
contentLength	TokenNameIdentifier
+	TokenNamePLUS
" B"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
throughput	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
duration	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
resource	TokenNameIdentifier
.	TokenNameDOT
getTransferStartTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
duration	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
DecimalFormat	TokenNameIdentifier
format	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DecimalFormat	TokenNameIdentifier
(	TokenNameLPAREN
"0.0"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
DecimalFormatSymbols	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
kbPerSec	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
contentLength	TokenNameIdentifier
/	TokenNameDIVIDE
1024.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
(	TokenNameLPAREN
duration	TokenNameIdentifier
/	TokenNameDIVIDE
1000.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throughput	TokenNameIdentifier
=	TokenNameEQUAL
" at "	TokenNameStringLiteral
+	TokenNamePLUS
format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
kbPerSec	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" KB/sec"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
+	TokenNamePLUS
": "	TokenNameStringLiteral
+	TokenNamePLUS
resource	TokenNameIdentifier
.	TokenNameDOT
getRepositoryUrl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
resource	TokenNameIdentifier
.	TokenNameDOT
getResourceName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" ("	TokenNameStringLiteral
+	TokenNamePLUS
len	TokenNameIdentifier
+	TokenNamePLUS
throughput	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
long	TokenNamelong
toKB	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
bytes	TokenNameIdentifier
+	TokenNamePLUS
1023	TokenNameIntegerLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE