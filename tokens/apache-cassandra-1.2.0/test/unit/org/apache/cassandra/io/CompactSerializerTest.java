package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
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
junit	TokenNameIdentifier
.	TokenNameDOT
BeforeClass	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
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
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
ParameterizedType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CompactSerializerTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
expectedClassNames	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
discoveredClassNames	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
BeforeClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
scanClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectedClassNames	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"RangeSliceCommandSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"IndexScanCommandSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"ReadCommandSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"ReadResponseSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"RowSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"RowMutationSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"SliceByNamesReadCommandSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"SliceFromReadCommandSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"TruncateResponseSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"TruncationSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"WriteResponseSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"EndpointStateSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"GossipDigestSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"GossipDigestAck2Serializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"GossipDigestAckSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"GossipDigestSynSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"HeartBeatStateSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"VersionedValueSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"PendingFileSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"StreamHeaderSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"FileStatusSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"StreamRequestSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"CounterMutationSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"HashableSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"StreamingRepairTaskSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"AbstractBoundsSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"SnapshotCommandSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"RangeSliceReplySerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"StringSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"CallbackDeterminedSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"TreeRequestSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"ValidatorSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"MigrationsSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"InnerSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"LeafSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"MerkleTreeSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"UUIDSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"Serializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"ColumnFamilySerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"CompressionInfoSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"ChunkSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
discoveredClassNames	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
cp	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.class.path"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
parts	TokenNameIdentifier
=	TokenNameEQUAL
cp	TokenNameIdentifier
.	TokenNameDOT
split	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
.	TokenNameDOT
pathSeparator	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
class	TokenNameclass
DirScanner	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
scan	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
f	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
newCtx	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"org"	TokenNameStringLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
:	TokenNameCOLON
ctx	TokenNameIdentifier
+	TokenNamePLUS
"."	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
File	TokenNameIdentifier
child	TokenNameIdentifier
:	TokenNameCOLON
f	TokenNameIdentifier
.	TokenNameDOT
listFiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
scan	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
,	TokenNameCOMMA
newCtx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".class"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fName	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
className	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
+	TokenNamePLUS
"."	TokenNameStringLiteral
+	TokenNamePLUS
fName	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
fName	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
cls	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
simpleName	TokenNameIdentifier
=	TokenNameEQUAL
cls	TokenNameIdentifier
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
classTraversal	TokenNameIdentifier
:	TokenNameCOLON
while	TokenNamewhile
(	TokenNameLPAREN
cls	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Type	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
interfaces	TokenNameIdentifier
=	TokenNameEQUAL
cls	TokenNameIdentifier
.	TokenNameDOT
getGenericInterfaces	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Type	TokenNameIdentifier
t	TokenNameIdentifier
:	TokenNameCOLON
interfaces	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
instanceof	TokenNameinstanceof
ParameterizedType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ParameterizedType	TokenNameIdentifier
pt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ParameterizedType	TokenNameIdentifier
)	TokenNameRPAREN
t	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Class	TokenNameIdentifier
)	TokenNameRPAREN
pt	TokenNameIdentifier
.	TokenNameDOT
getRawType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"IVersionedSerializer"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
discoveredClassNames	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
simpleName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
classTraversal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
cls	TokenNameIdentifier
=	TokenNameEQUAL
cls	TokenNameIdentifier
.	TokenNameDOT
getSuperclass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
DirScanner	TokenNameIdentifier
dirScanner	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DirScanner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
cpItem	TokenNameIdentifier
:	TokenNameCOLON
parts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
cpItem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
f	TokenNameIdentifier
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
dirScanner	TokenNameIdentifier
.	TokenNameDOT
scan	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
verifyAllSimpleNamesTest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
clsName	TokenNameIdentifier
:	TokenNameCOLON
expectedClassNames	TokenNameIdentifier
)	TokenNameRPAREN
assert	TokenNameassert
discoveredClassNames	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
clsName	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
clsName	TokenNameIdentifier
+	TokenNamePLUS
" was not discovered"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
noOthersTest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
clsName	TokenNameIdentifier
:	TokenNameCOLON
discoveredClassNames	TokenNameIdentifier
)	TokenNameRPAREN
assert	TokenNameassert
expectedClassNames	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
clsName	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
clsName	TokenNameIdentifier
+	TokenNamePLUS
" was discovered"	TokenNameStringLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE