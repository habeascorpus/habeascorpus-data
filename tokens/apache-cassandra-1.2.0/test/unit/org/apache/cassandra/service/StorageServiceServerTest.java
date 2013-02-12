package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
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
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
ConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
Table	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
.	TokenNameDOT
Token	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
SchemaLoader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
DatabaseDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StorageServiceServerTest	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRegularMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
InterruptedException	TokenNameIdentifier
,	TokenNameCOMMA
ConfigurationException	TokenNameIdentifier
{	TokenNameLBRACE
SchemaLoader	TokenNameIdentifier
.	TokenNameDOT
mkdirs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SchemaLoader	TokenNameIdentifier
.	TokenNameDOT
cleanup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
initServer	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
path	TokenNameIdentifier
:	TokenNameCOLON
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getAllDataFileLocations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
path	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
stopClient	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGetAllRangesEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
toks	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getAllRanges	TokenNameIdentifier
(	TokenNameLPAREN
toks	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
takeSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
"snapshot"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testColumnFamilySnapshot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
takeColumnFamilySnapshot	TokenNameIdentifier
(	TokenNameLPAREN
Table	TokenNameIdentifier
.	TokenNameDOT
SYSTEM_KS	TokenNameIdentifier
,	TokenNameCOMMA
"Schema"	TokenNameStringLiteral
,	TokenNameCOMMA
"cf_snapshot"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE